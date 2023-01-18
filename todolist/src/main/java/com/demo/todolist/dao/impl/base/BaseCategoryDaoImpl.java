package com.demo.todolist.dao.impl.base;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.todolist.repository.CategoryRepository;

public class BaseCategoryDaoImpl extends BaseEntityManager{
	@Autowired
    public CategoryRepository repository;
}
