package com.codegym.vn.Service;

import com.codegym.vn.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    Product findById(long id);

    void save(Product product);

    void delete(long id);

    List<Product> getList(String name);
}
