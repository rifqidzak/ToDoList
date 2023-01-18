package com.demo.todolist.dao.impl.category;

import org.springframework.stereotype.Repository;

import com.demo.todolist.dao.category.UpdateCategoryDao;
import com.demo.todolist.dao.impl.base.BaseCategoryDaoImpl;
import com.demo.todolist.model.Category;
@Repository
public class UpdateCategoryDaoImpl extends BaseCategoryDaoImpl implements UpdateCategoryDao{

    @Override
    public Category updateCategory(Category data) {
        return repository.saveAndFlush(data);
    }
    
}
