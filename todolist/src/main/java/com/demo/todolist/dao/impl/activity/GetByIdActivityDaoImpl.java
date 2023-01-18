package com.demo.todolist.dao.impl.activity;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.demo.todolist.dao.activity.GetByIdActivityDao;
import com.demo.todolist.dao.impl.base.BaseActivityDaoImpl;
import com.demo.todolist.model.Activity;
@Repository
public class GetByIdActivityDaoImpl extends BaseActivityDaoImpl implements GetByIdActivityDao{

    @Override
    public Optional<Activity> getById(String id) {
        Optional<Activity> optional = repository.findById(id);
		Activity activity = new Activity();
		if(optional.isPresent()) {			
			activity = optional.get();
			detach(activity);
		}
		return Optional.ofNullable(activity);
    }
    
}
