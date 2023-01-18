package com.demo.todolist.dao.category;

import java.util.Optional;

import com.demo.todolist.model.Category;

public interface GetByIdCategoryDao {
    Optional<Category>getById(String id);
}
