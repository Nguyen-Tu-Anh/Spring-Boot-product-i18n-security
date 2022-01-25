package com.codegym.vn.Controller;

import com.codegym.vn.Service.ICategoryService;
import com.codegym.vn.Service.IProductService;
import com.codegym.vn.model.Category;
import com.codegym.vn.model.Language;
import com.codegym.vn.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@RestController
@CrossOrigin("*")
@RequestMapping("/products")
public class ProductController {
    @Autowired
    IProductService productService;
    @Autowired
    ICategoryService categoryService;
    @Autowired
    MessageSource messageSource;

    @GetMapping
    public ResponseEntity<List<Product>> show() {
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);

    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        productService.save(product);
        return product;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        return new ResponseEntity<>(productService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        productService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> edit(@PathVariable Long id, @RequestBody Product product){
        product.setId(id);
        productService.save(product);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping("/search/{name}")
    public ResponseEntity<List<Product>> demo(@PathVariable String name){
        return new ResponseEntity<>(productService.getList(name), HttpStatus.OK);
    }

    @GetMapping("/category")
    public ResponseEntity<List<Category>> list() {
        return new ResponseEntity<>(categoryService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/language")
    public Language home(@RequestParam(defaultValue = "en") String lg){
        String home = messageSource.getMessage("HOME",null,new Locale(lg));
        String language = messageSource.getMessage("LANGUAGE",null,new Locale(lg));
        String vietnamese = messageSource.getMessage("VIETNAMESE",null,new Locale(lg));
        String english = messageSource.getMessage("ENGLISH",null,new Locale(lg));
        String name = messageSource.getMessage("Name",null,new Locale(lg));
        String price = messageSource.getMessage("Price",null,new Locale(lg));
        String image = messageSource.getMessage("Image",null,new Locale(lg));
        String category = messageSource.getMessage("Category",null,new Locale(lg));
        String action = messageSource.getMessage("Action",null,new Locale(lg));

        return new Language(home,language,vietnamese,english,name,price,image,category,action);
    }

}