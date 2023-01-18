package com.demo.todolist.service.activity;

import java.util.List;

import com.demo.todolist.dto.GetResDto;
import com.demo.todolist.dto.activity.GetActivityDataDto;

public interface GetAllActivityByCategoryActiveService {
    GetResDto<List<GetActivityDataDto>> getAllActivityByCategoryActive(String categoryId);
}
