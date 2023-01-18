package com.demo.todolist.service.activity;

import com.demo.todolist.dto.InsertResDto;
import com.demo.todolist.dto.activity.InsertActivityDto;

public interface InsertActivityService {
    InsertResDto insert(InsertActivityDto data);
}
