package com.demo.todolist.dao.impl.category;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.todolist.dao.category.GetAllCategoryDao;
import com.demo.todolist.dao.impl.base.BaseCategoryDaoImpl;
import com.demo.todolist.model.Category;
@Repository
public class GetAllCategoryDaoImpl extends BaseCategoryDaoImpl implements GetAllCategoryDao{

    @Override
    public List<Category> getAllCategory() {
        return repository.findAll();
    }
    
}
