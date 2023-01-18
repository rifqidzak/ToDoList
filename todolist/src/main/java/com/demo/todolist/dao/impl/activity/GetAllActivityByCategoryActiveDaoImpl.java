package com.demo.todolist.dao.impl.activity;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.todolist.dao.activity.GetAllActivityByCategoryActiveDao;
import com.demo.todolist.dao.impl.base.BaseActivityDaoImpl;
import com.demo.todolist.model.Activity;
@Repository
public class GetAllActivityByCategoryActiveDaoImpl extends BaseActivityDaoImpl implements GetAllActivityByCategoryActiveDao{

    @Override
    public List<Activity> getAllByCategoryActiveDao(String categoryId) {
        return repository.getAllActivityByCategoryActive(categoryId);
    }



    
}
