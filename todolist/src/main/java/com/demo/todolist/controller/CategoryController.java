package com.demo.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.todolist.dto.DeleteResDto;
import com.demo.todolist.dto.GetResDto;
import com.demo.todolist.dto.InsertResDto;
import com.demo.todolist.dto.UpdateResDto;
import com.demo.todolist.dto.category.GetCategoryDataDto;
import com.demo.todolist.dto.category.InsertCategoryDto;
import com.demo.todolist.dto.category.UpdateCategoryDto;
import com.demo.todolist.service.category.DeleteCategoryService;
import com.demo.todolist.service.category.GetAllCategoryService;
import com.demo.todolist.service.category.GetByIdCategoryService;
import com.demo.todolist.service.category.InsertCategoryService;
import com.demo.todolist.service.category.UpdateCategoryService;

@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    InsertCategoryService insertCategoryService;
    
    @Autowired
    UpdateCategoryService updateCategoryService;
    
    @Autowired
    GetAllCategoryService getAllCategoryService;
    
    @Autowired
    GetByIdCategoryService getByIdCategoryService;
    
    @Autowired
    DeleteCategoryService deleteCategoryService;
    
	@GetMapping
	public ResponseEntity<GetResDto<List<GetCategoryDataDto>>> getAll() {
		final GetResDto<List<GetCategoryDataDto>> data = getAllCategoryService.getAllCategory();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<GetResDto<GetCategoryDataDto>> getById(@PathVariable String id) {
		final GetResDto<GetCategoryDataDto> data = getByIdCategoryService.getByIdCategory(id);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
    @PostMapping
	public ResponseEntity<InsertResDto> insert(@RequestBody InsertCategoryDto data) {
		final InsertResDto result = insertCategoryService.insert(data);
		return new ResponseEntity<>(result, HttpStatus.CREATED);
	}
    
    @PutMapping
	public ResponseEntity<UpdateResDto> update(@RequestBody UpdateCategoryDto data) {
		final UpdateResDto result = updateCategoryService.update(data);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
    
    @DeleteMapping("{id}")
   	public ResponseEntity<DeleteResDto> delete(@PathVariable String id) {
   		final DeleteResDto result = deleteCategoryService.delete(id);
   		return new ResponseEntity<>(result, HttpStatus.OK);
   	}
}
