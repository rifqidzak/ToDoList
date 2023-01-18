package com.demo.todolist.service.impl.activity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.todolist.dao.activity.GetAllActivityByCategoryActiveDao;
import com.demo.todolist.dto.GetResDto;
import com.demo.todolist.dto.activity.GetActivityDataDto;
import com.demo.todolist.model.Activity;
import com.demo.todolist.service.activity.GetAllActivityByCategoryActiveService;

@Service
public class GetAllActivityByCategoryActiveServiceImpl implements GetAllActivityByCategoryActiveService{

	@Autowired
	GetAllActivityByCategoryActiveDao getAllActivityByCategoryActiveDao;
	@Override
	public GetResDto<List<GetActivityDataDto>> getAllActivityByCategoryActive(String categoryId) {
        List<Activity> activities = getAllActivityByCategoryActiveDao.getAllByCategoryActiveDao(categoryId);
        final List<GetActivityDataDto>activityDataDtos = new ArrayList<>();
        if(activities.size()>0){
            for(Activity activity : activities){
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
