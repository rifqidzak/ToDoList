package com.demo.todolist.service.impl.activity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.todolist.dao.activity.GetAllActivityByCategoryExpiredDao;
import com.demo.todolist.dto.GetResDto;
import com.demo.todolist.dto.activity.GetActivityDataDto;
import com.demo.todolist.model.Activity;
import com.demo.todolist.service.activity.GetAllActivityByCategoryExpiredService;

@Service
public class GetAllActivityByCategoryExpiredServiceImpl implements GetAllActivityByCategoryExpiredService {

	@Autowired
	GetAllActivityByCategoryExpiredDao getAllActivityByCategoryExpiredDao;

	@Override
	public GetResDto<List<GetActivityDataDto>> getAllActivityByCategoryExpired(String categoryId) {
		List<Activity> activities = getAllActivityByCategoryExpiredDao.getAllByCategoryExpiredDao(categoryId);
		final List<GetActivityDataDto> activityDataDtos = new ArrayList<>();
		if (activities.size() > 0) {
			for (Activity activity : activities) {
				GetActivityDataDto getActivityDataDto = new GetActivityDataDto();
				getActivityDataDto.setCategoryCode(activity.getCategory().getCode());
				getActivityDataDto.setCategoryName(activity.getCategory().getCategory());
				getActivityDataDto.setDescription(activity.getDescription());
				getActivityDataDto.setStartTime(activity.getStartTime());
				getActivityDataDto.setEndTime(activity.getEndTime());
				getActivityDataDto.setId(activity.getId());
				getActivityDataDto.setVersion(activity.getVersion());
				getActivityDataDto.setTitle(activity.getTitle());
				getActivityDataDto.setFinished(activity.getFinished());
				getActivityDataDto.setIsActive(activity.getIsActive());
				activityDataDtos.add(getActivityDataDto);
			}
		}
		GetResDto<List<GetActivityDataDto>> getResDto = new GetResDto<>();
		getResDto.setData(activityDataDtos);
		return getResDto;
	}

}
