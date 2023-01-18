package com.demo.todolist.dao.impl.category;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.demo.todolist.dao.category.GetByIdCategoryDao;
import com.demo.todolist.dao.impl.base.BaseCategoryDaoImpl;
import com.demo.todolist.model.Category;
@Repository
public class GetByIdCategoryDaoImpl extends BaseCategoryDaoImpl implements GetByIdCategoryDao{

    @Override
    public Optional<Category> getById(String id) {
        Optional<Category> optional = repository.findById(id);
		Category category = new Category();
		if(optional.isPresent()) {			
			category = optional.get();
			detach(category);
		}
		return Optional.ofNullable(category);
    }
    
}
