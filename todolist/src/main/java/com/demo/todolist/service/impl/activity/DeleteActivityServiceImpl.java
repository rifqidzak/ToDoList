package com.demo.todolist.service.impl.activity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.todolist.dao.activity.DeleteActivityDao;
import com.demo.todolist.dto.DeleteResDto;
import com.demo.todolist.service.activity.DeleteActivityService;

@Service
public class DeleteActivityServiceImpl implements DeleteActivityService{

    @Autowired
    DeleteActivityDao activityDao;
    
    @Override
    public DeleteResDto delete(String id) {
        boolean deleted = activityDao.delete(id);
        if(deleted){
            DeleteResDto res = new DeleteResDto();
            res.setMessage("Deleted Successfully");
            return res;
        }else{
            DeleteResDto res = new DeleteResDto();
            res.setMessage("Deleted Failed");
            return res;
        }
    }
    
}
