package com.demo.todolist.service.activity;

import com.demo.todolist.dto.UpdateResDto;
import com.demo.todolist.dto.activity.UpdateActivityDto;

public interface UpdateActivityService {
    UpdateResDto update(UpdateActivityDto data);
}
