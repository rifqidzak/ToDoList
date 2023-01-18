package com.demo.todolist.service.activity;

import com.demo.todolist.dto.GetResDto;
import com.demo.todolist.dto.activity.GetActivityDataDto;

public interface GetByIdActivityService {
    GetResDto<GetActivityDataDto> getByIdActivity(String id);
}
