package com.demo.todolist.dao.impl.activity;

import org.springframework.stereotype.Repository;

import com.demo.todolist.dao.activity.InsertActivityDao;
import com.demo.todolist.dao.impl.base.BaseActivityDaoImpl;
import com.demo.todolist.model.Activity;
@Repository
public class InsertActivityDaoImpl extends BaseActivityDaoImpl implements InsertActivityDao {

    @Override
    public Activity insert(Activity data) {
        return repository.save(data);
    }
    
}
