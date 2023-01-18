package com.demo.todolist.service.impl.category;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.todolist.dao.category.DeleteCategoryDao;
import com.demo.todolist.dto.DeleteResDto;
import com.demo.todolist.service.category.DeleteCategoryService;

@Service
public class DeleteCategoryServiceImpl implements DeleteCategoryService{
	@Autowired
	DeleteCategoryDao deleteCategoryDao;
	
	@Transactional
	@Override
	public DeleteResDto delete(String id) {
		final Boolean success = deleteCategoryDao.delete(id);
		final DeleteResDto deleteResDto = new DeleteResDto();
		if(success) {
			deleteResDto.setMessage("Delete Success");
		}else {
			deleteResDto.setMessage("Delete Failed");			
		}
		
		return deleteResDto;
	}

}
