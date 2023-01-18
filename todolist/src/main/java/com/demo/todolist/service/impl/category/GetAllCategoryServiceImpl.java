package com.demo.todolist.service.impl.category;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.todolist.dao.category.GetAllCategoryDao;
import com.demo.todolist.dto.GetResDto;
import com.demo.todolist.dto.category.GetCategoryDataDto;
import com.demo.todolist.model.Category;
import com.demo.todolist.service.category.GetAllCategoryService;

@Service
public class GetAllCategoryServiceImpl implements GetAllCategoryService {
	@Autowired
	GetAllCategoryDao getAllCategoryDao;

	@Override
	public GetResDto<List<GetCategoryDataDto>> getAllCategory() {
		List<Category> categories = getAllCategoryDao.getAllCategory();
		List<GetCategoryDataDto>getCategoryDataDtos = new ArrayList<>();
		if (categories.size() > 0) {
			for (Category category : categories) {
				GetCategoryDataDto getCategoryDataDto = new GetCategoryDataDto();
				getCategoryDataDto.setCategory(category.getCategory());
				getCategoryDataDto.setCode(category.getCode());
				getCategoryDataDto.setId(category.getId());
				getCategoryDataDto.setVersion(category.getVersion());
				getCategoryDataDtos.add(getCategoryDataDto);
			}
		}
		GetResDto<List<GetCategoryDataDto>> getResDto = new GetResDto<>();
		getResDto.setData(getCategoryDataDtos);
		return getResDto;
	}

}
