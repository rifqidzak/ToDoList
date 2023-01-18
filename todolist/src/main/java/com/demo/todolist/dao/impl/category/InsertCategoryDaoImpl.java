package com.demo.todolist.dao.impl.category;

import org.springframework.stereotype.Repository;

import com.demo.todolist.dao.category.InsertCategoryDao;
import com.demo.todolist.dao.impl.base.BaseCategoryDaoImpl;
import com.demo.todolist.model.Category;
@Repository
public class InsertCategoryDaoImpl extends BaseCategoryDaoImpl implements InsertCategoryDao{

    @Override
    public Category insertCategory(Category data) {
        return repository.save(data);
    }
    
}
