package com.demo.todolist.dao.impl.activity;

import org.springframework.stereotype.Repository;

import com.demo.todolist.dao.activity.UpdateActivityDao;
import com.demo.todolist.dao.impl.base.BaseActivityDaoImpl;
import com.demo.todolist.model.Activity;
@Repository
public class UpdateActivityDaoImpl extends BaseActivityDaoImpl implements UpdateActivityDao{

    @Override
    public Activity update(Activity data) {
        return repository.saveAndFlush(data);
    }
    
}
