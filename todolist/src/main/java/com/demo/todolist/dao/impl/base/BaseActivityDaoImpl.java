package com.demo.todolist.dao.impl.base;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.todolist.repository.ActivityRepository;

public class BaseActivityDaoImpl extends BaseEntityManager{
	@Autowired
    public ActivityRepository repository;
}
