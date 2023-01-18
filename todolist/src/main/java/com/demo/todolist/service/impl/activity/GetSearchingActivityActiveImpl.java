package com.demo.todolist.service.impl.activity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.todolist.dao.activity.GetAllActivityActiveDao;
import com.demo.todolist.dto.GetResDto;
import com.demo.todolist.dto.activity.GetActivityDataDto;
import com.demo.todolist.model.Activity;
import com.demo.todolist.service.activity.GetSearchingActivityActive;

@Service
public class GetSearchingActivityActiveImpl implements GetSearchingActivityActive{
    @Autowired
    GetAllActivityActiveDao getAllActivityActiveDao;
    
	@Override
	public GetResDto<List<GetActivityDataDto>> getSearchingActivityActive(String title) {
		List<Activity> activities = getAllActivityActiveDao.getAllActivityActiveDao();
        List<Activity> resultSearch = activities.stream().filter(res->
        res.getTitle().toLowerCase().contains(title.toLowerCase())).collect(Collectors.toList());
        final List<GetActivityDataDto>activityDataDtos = new ArrayList<>();
        if(activities.size()>0){
            for(Activity activity : resultSearch){
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
