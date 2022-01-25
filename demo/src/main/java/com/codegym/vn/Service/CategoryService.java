package com.codegym.vn.Service;

import com.codegym.vn.Repository.ICategoryRepo;
import com.codegym.vn.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService implements ICategoryService{

    @Autowired
    ICategoryRepo categoryRepo;
    @Override
    public List<Category> findAll() {
        return (List<Category>) categoryRepo.findAll();
    }
}
