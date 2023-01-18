package com.demo.todolist.dao.impl.activity;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.todolist.dao.activity.GetAllActivityByCategoryExpiredDao;
import com.demo.todolist.dao.impl.base.BaseActivityDaoImpl;
import com.demo.todolist.model.Activity;
@Repository
public class GetAllActivityByCategoryExpiredDaoImpl extends BaseActivityDaoImpl implements GetAllActivityByCategoryExpiredDao{

    @Override
    public List<Activity> getAllByCategoryExpiredDao(String categoryId) {
        return repository.getAllActivityByCategoryExpired(categoryId);
    }   
}
