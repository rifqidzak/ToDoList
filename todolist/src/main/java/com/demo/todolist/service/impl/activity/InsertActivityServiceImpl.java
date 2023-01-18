package com.demo.todolist.service.impl.activity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.todolist.dao.activity.InsertActivityDao;
import com.demo.todolist.dao.category.GetByIdCategoryDao;
import com.demo.todolist.dto.InsertResDataDto;
import com.demo.todolist.dto.InsertResDto;
import com.demo.todolist.dto.activity.InsertActivityDto;
import com.demo.todolist.model.Activity;
import com.demo.todolist.service.activity.InsertActivityService;

@Service
public class InsertActivityServiceImpl implements InsertActivityService {
    @Autowired
    InsertActivityDao insertActivityDao;    

    @Autowired
    GetByIdCategoryDao getByIdCategoryDao;
    @Override
    public InsertResDto insert(InsertActivityDto data) {
        Activity activityInsert = new Activity();
        if(data.getCategoryId() != null){
            activityInsert.setCategory(getByIdCategoryDao.getById(data.getCategoryId()).get());
        }
        activityInsert.setDescription(data.getDescription());
        activityInsert.setEndTime(data.getEndTime());
        activityInsert.setStartTime(data.getStartTime());
        activityInsert.setTitle(data.getTitle());
        activityInsert = insertActivityDao.insert(activityInsert);
        InsertResDataDto insertResData = new InsertResDataDto();
        insertResData.setId(activityInsert.getId());
        InsertResDto insertResDto = new InsertResDto();
        insertResDto.setData(insertResData);
        insertResDto.setMessage("Success Data Insert");
        return insertResDto;
    }
    
}
