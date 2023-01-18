package com.demo.todolist.service.impl.activity;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.todolist.dao.impl.base.BaseActivityDaoImpl;
import com.demo.todolist.model.Activity;
import com.demo.todolist.service.activity.GetAllExpiredActivityForScheduler;

@Repository
public class GetAllExpiredActivityForSchedulerImpl extends BaseActivityDaoImpl implements GetAllExpiredActivityForScheduler{

	@Override
	public List<Activity> getAllExpiredActivityForScheduler() {
		System.out.println("Running Task...");
		return repository.getAllExpiredByTimeForScheduler();
	}

}
