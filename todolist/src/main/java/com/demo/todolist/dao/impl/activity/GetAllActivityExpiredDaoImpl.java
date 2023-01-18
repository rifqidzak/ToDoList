package com.demo.todolist.dao.impl.activity;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.todolist.dao.activity.GetAllActivityExpiredDao;
import com.demo.todolist.dao.impl.base.BaseActivityDaoImpl;
import com.demo.todolist.model.Activity;
@Repository
public class GetAllActivityExpiredDaoImpl extends BaseActivityDaoImpl implements GetAllActivityExpiredDao{

    @Override
    public List<Activity> getAllActivityExpiredDao() {
        return repository.getExpiredActivity();
    }
    
}
