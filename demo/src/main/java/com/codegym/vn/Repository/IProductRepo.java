package com.codegym.vn.Repository;

import com.codegym.vn.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProductRepo extends CrudRepository<Product, Long> {
    @Query(nativeQuery = true, value = "select * from product where product.name like concat ('%',:name,'%')")
    List<Product> getSearch(@Param("name") String name);
}

