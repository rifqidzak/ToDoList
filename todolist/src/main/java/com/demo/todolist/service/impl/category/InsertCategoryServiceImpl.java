package com.demo.todolist.service.impl.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.todolist.dao.category.InsertCategoryDao;
import com.demo.todolist.dto.InsertResDataDto;
import com.demo.todolist.dto.InsertResDto;
import com.demo.todolist.dto.category.InsertCategoryDto;
import com.demo.todolist.model.Category;
import com.demo.todolist.service.category.InsertCategoryService;
import com.demo.todolist.service.generate.GenerateService;

@Service
public class InsertCategoryServiceImpl implements InsertCategoryService{
    @Autowired
    InsertCategoryDao insertCategoryDao;
    
    @Autowired
    GenerateService generateService;
    
    @Override
    public InsertResDto insert(InsertCategoryDto data) {
        Category categoryInsert = new Category();
        categoryInsert.setCategory(data.getCategory());
        categoryInsert.setCode(generateService.generate(5));
        categoryInsert = insertCategoryDao.insertCategory(categoryInsert);

        InsertResDataDto insertResData = new InsertResDataDto();
        insertResData.setId(categoryInsert.getId());
        InsertResDto insertResDto = new InsertResDto();
        insertResDto.setData(insertResData);
        insertResDto.setMessage("Succes Data Insert");
        return insertResDto;
    }
    
}
