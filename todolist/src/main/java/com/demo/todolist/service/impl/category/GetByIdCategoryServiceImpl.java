package com.demo.todolist.service.impl.category;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.todolist.dao.impl.category.GetByIdCategoryDaoImpl;
import com.demo.todolist.dto.GetResDto;
import com.demo.todolist.dto.category.GetCategoryDataDto;
import com.demo.todolist.model.Category;
import com.demo.todolist.service.category.GetByIdCategoryService;

@Service
public class GetByIdCategoryServiceImpl implements GetByIdCategoryService{
	@Autowired
	GetByIdCategoryDaoImpl getByIdCategoryDaoImpl;
	@Override
	public GetResDto<GetCategoryDataDto> getByIdCategory(String id) {
		Optional<Category>optional = getByIdCategoryDaoImpl.getById(id);
		GetResDto<GetCategoryDataDto> getResDto = new GetResDto<>();
		GetCategoryDataDto getCategoryDataDto = new GetCategoryDataDto();
		if(optional.isPresent()) {
			getCategoryDataDto.setCategory(optional.get().getCategory());
			getCategoryDataDto.setCode(optional.get().getCode());
			getCategoryDataDto.setId(optional.get().getId());
			getCategoryDataDto.setVersion(optional.get().getVersion());
		}
		getResDto.setData(getCategoryDataDto);
		return getResDto;
	}

}
