package com.codegym.vn.Repository;

import com.codegym.vn.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryRepo extends CrudRepository<Category, Long> {
}
