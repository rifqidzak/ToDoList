package com.demo.todolist.dao.activity;

import java.util.List;

import com.demo.todolist.model.Activity;

public interface GetAllActivityByCategoryExpiredDao {
    List<Activity>getAllByCategoryExpiredDao(String categoryId);
}
