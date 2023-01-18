package com.demo.todolist.service.impl.category;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.todolist.dao.category.GetByIdCategoryDao;
import com.demo.todolist.dao.category.UpdateCategoryDao;
import com.demo.todolist.dto.UpdateResDataDto;
import com.demo.todolist.dto.UpdateResDto;
import com.demo.todolist.dto.category.UpdateCategoryDto;
import com.demo.todolist.model.Category;
import com.demo.todolist.service.category.UpdateCategoryService;

@Service
public class UpdateCategoryServiceImpl implements UpdateCategoryService {

	@Autowired
	UpdateCategoryDao updateCategoryDao;
	
	@Autowired
	GetByIdCategoryDao getByIdCategoryDao;

	@Override
	public UpdateResDto update(UpdateCategoryDto data) {
		Optional<Category> optional = getByIdCategoryDao.getById(data.getId());
		Category categoryUpdate = new Category();
		UpdateResDto updateResDto = new UpdateResDto();
		if(optional.isPresent()) {
			UpdateResDataDto updateResDataDto =new UpdateResDataDto();
			categoryUpdate = optional.get();
			categoryUpdate.setCategory(data.getCategory());
			categoryUpdate = updateCategoryDao.updateCategory(categoryUpdate);
			updateResDataDto.setVersion(categoryUpdate.getVersion());
			updateResDto.setData(updateResDataDto);
			updateResDto.setMessage("Updating Success");
		}
		return updateResDto;
	}
	
}
