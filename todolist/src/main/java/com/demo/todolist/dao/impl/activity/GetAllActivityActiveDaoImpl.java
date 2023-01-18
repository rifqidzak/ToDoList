package com.demo.todolist.dao.impl.activity;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.todolist.dao.activity.GetAllActivityActiveDao;
import com.demo.todolist.dao.impl.base.BaseActivityDaoImpl;
import com.demo.todolist.model.Activity;
@Repository
public class GetAllActivityActiveDaoImpl extends BaseActivityDaoImpl implements GetAllActivityActiveDao{

    @Override
    public List<Activity> getAllActivityActiveDao() {
        return repository.getAllActiveSchedule();
    }
    
}
