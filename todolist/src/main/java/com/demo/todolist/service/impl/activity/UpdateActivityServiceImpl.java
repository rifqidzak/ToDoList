package com.demo.todolist.service.impl.activity;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.todolist.dao.activity.GetByIdActivityDao;
import com.demo.todolist.dao.activity.UpdateActivityDao;
import com.demo.todolist.dao.category.GetByIdCategoryDao;
import com.demo.todolist.dto.UpdateResDataDto;
import com.demo.todolist.dto.UpdateResDto;
import com.demo.todolist.dto.activity.UpdateActivityDto;
import com.demo.todolist.model.Activity;
import com.demo.todolist.model.Category;
import com.demo.todolist.service.activity.UpdateActivityService;

@Service
public class UpdateActivityServiceImpl implements UpdateActivityService {

	@Autowired
	GetByIdActivityDao getByIdActivityDao;

	@Autowired
	UpdateActivityDao updateActivityDao;
	
	@Autowired
	GetByIdCategoryDao getByIdCategoryDao;

	@Override
	public UpdateResDto update(UpdateActivityDto data) {

		Optional<Activity> optional = getByIdActivityDao.getById(data.getId());
		UpdateResDto updateResDto = new UpdateResDto();
		UpdateResDataDto updateResDataDto = new UpdateResDataDto();
		if (optional.isPresent()) {
			Activity activityUpdate = new Activity();
			activityUpdate = optional.get();
			if(data.getStartTime()!= null) {
				activityUpdate.setStartTime(data.getStartTime());				
			}
			if(data.getEndTime()!= null) {
				activityUpdate.setEndTime(data.getEndTime());
			}
			if(data.getCategoryId()!= null) {
				Optional<Category>categoryOptional = getByIdCategoryDao.getById(data.getCategoryId());
				if(categoryOptional.isPresent()) {
					activityUpdate.setCategory(categoryOptional.get());
				}
			}
			
			if(data.getDescription()!=null) {
				activityUpdate.setDescription(data.getDescription());
			}
			
			if(data.getFinished()!= null) {
				activityUpdate.setFinished(data.getFinished());
			}
			
			if(data.getTitle()!= null) {
				activityUpdate.setTitle(data.getTitle());
			}
			
			activityUpdate = updateActivityDao.update(activityUpdate);
			updateResDataDto.setVersion(activityUpdate.getVersion());
		}
		updateResDto.setData(updateResDataDto);
		updateResDto.setMessage("Updating Success");
		return updateResDto;
	}

}
