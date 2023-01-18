package com.demo.todolist.service.category;

import com.demo.todolist.dto.UpdateResDto;
import com.demo.todolist.dto.category.UpdateCategoryDto;

public interface UpdateCategoryService {
    UpdateResDto update(UpdateCategoryDto data);
}
