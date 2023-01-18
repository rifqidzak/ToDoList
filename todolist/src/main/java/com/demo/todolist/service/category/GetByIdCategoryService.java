package com.demo.todolist.service.category;

import com.demo.todolist.dto.GetResDto;
import com.demo.todolist.dto.category.GetCategoryDataDto;

public interface GetByIdCategoryService {
    GetResDto<GetCategoryDataDto> getByIdCategory(String id);
}
