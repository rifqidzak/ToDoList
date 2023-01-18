package com.demo.todolist.service.category;

import com.demo.todolist.dto.InsertResDto;
import com.demo.todolist.dto.category.InsertCategoryDto;

public interface InsertCategoryService {
    InsertResDto insert(InsertCategoryDto data);
}
