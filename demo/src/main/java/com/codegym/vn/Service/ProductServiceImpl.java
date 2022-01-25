package com.codegym.vn.Service;

import com.codegym.vn.Repository.IProductRepo;
import com.codegym.vn.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    IProductRepo iProductRepo;

    @Override
    public List<Product> findAll() {
        return (List<Product>) iProductRepo.findAll();
    }

    @Override
    public Product findById(long id) {
        return iProductRepo.findById(id).get();
    }

    @Override
    public void save(Product product) {
        iProductRepo.save(product);
    }

    @Override
    public void delete(long id) {
        iProductRepo.deleteById(id);
    }

    @Override
    public List<Product> getList(String name) {
        return iProductRepo.getSearch(name);
    }
}
