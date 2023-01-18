package com.demo.todolist.dao.impl.category;

import org.springframework.stereotype.Repository;

import com.demo.todolist.dao.category.DeleteCategoryDao;
import com.demo.todolist.dao.impl.base.BaseCategoryDaoImpl;
@Repository
public class DeleteCategoryDaoImpl extends BaseCategoryDaoImpl implements DeleteCategoryDao{

    @Override
    public Boolean delete(String id) {
        return repository.removeById(id) > 0;
    }
    
}
