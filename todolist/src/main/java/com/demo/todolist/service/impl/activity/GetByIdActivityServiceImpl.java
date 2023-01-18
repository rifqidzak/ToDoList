package com.demo.todolist.service.impl.activity;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.todolist.dao.activity.GetByIdActivityDao;
import com.demo.todolist.dto.GetResDto;
import com.demo.todolist.dto.activity.GetActivityDataDto;
import com.demo.todolist.model.Activity;
import com.demo.todolist.service.activity.GetByIdActivityService;

@Service
public class GetByIdActivityServiceImpl implements GetByIdActivityService{

	@Autowired
	GetByIdActivityDao getByIdActivityDao;
	@Override
	public GetResDto<GetActivityDataDto> getByIdActivity(String id) {
		Optional<Activity>optional = getByIdActivityDao.getById(id);
		GetActivityDataDto getActivityDataDto = new GetActivityDataDto();
		if(optional.isPresent()) {
			if(optional.get().getCategory()!=null) {
				getActivityDataDto.setCategoryCode(optional.get().getCategory().getCategory());				
				getActivityDataDto.setCategoryName(optional.get().getCategory().getCode());
			}
			getActivityDataDto.setDescription(optional.get().getDescription());
			getActivityDataDto.setStartTime(optional.get().getStartTime());
			getActivityDataDto.setEndTime(optional.get().getEndTime());
			getActivityDataDto.setFinished(optional.get().getFinished());
			getActivityDataDto.setId(optional.get().getId());
			getActivityDataDto.setIsActive(optional.get().getIsActive());
			getActivityDataDto.setTitle(optional.get().getTitle());
			getActivityDataDto.setVersion(optional.get().getVersion());
		}
		GetResDto<GetActivityDataDto> getResDto = new GetResDto<>();
		return getResDto;
	}

}
