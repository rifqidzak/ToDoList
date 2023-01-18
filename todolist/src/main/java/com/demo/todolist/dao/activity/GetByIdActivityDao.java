package com.demo.todolist.dao.activity;

import java.util.Optional;

import com.demo.todolist.model.Activity;

public interface GetByIdActivityDao {
    Optional<Activity>getById(String id);
}
