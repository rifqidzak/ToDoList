package com.demo.todolist.dao.impl.activity;

import org.springframework.stereotype.Repository;

import com.demo.todolist.dao.activity.DeleteActivityDao;
import com.demo.todolist.dao.impl.base.BaseActivityDaoImpl;

@Repository
public class DeleteActivityDaoImpl extends BaseActivityDaoImpl implements DeleteActivityDao{

    @Override
    public Boolean delete(String id) {
        return repository.removeById(id) > 0;
    }
    
}
