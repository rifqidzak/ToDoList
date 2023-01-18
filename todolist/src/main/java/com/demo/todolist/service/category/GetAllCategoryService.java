package com.demo.todolist.service.category;

import java.util.List;

import com.demo.todolist.dto.GetResDto;
import com.demo.todolist.dto.category.GetCategoryDataDto;

public interface GetAllCategoryService {
    GetResDto<List<GetCategoryDataDto>> getAllCategory();
}
