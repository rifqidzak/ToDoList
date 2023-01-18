package com.demo.todolist.dao.activity;

import java.util.List;

import com.demo.todolist.model.Activity;

public interface GetAllActivityByCategoryActiveDao {
    List<Activity>getAllByCategoryActiveDao(String categoryId);
}
