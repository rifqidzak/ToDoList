package com.demo.todolist.service.activity;

import java.util.List;

import com.demo.todolist.dto.GetResDto;
import com.demo.todolist.dto.activity.GetActivityDataDto;

public interface GetAllActivityByCategoryExpiredService {
    GetResDto<List<GetActivityDataDto>> getAllActivityByCategoryExpired(String categoryId);
}
