package com.demo.todolist.service.activity;

import java.util.List;

import com.demo.todolist.dto.GetResDto;
import com.demo.todolist.dto.activity.GetActivityDataDto;

public interface GetSearchingActivityExpired {
	GetResDto<List<GetActivityDataDto>> getSearchingActivityActive(String title);
}