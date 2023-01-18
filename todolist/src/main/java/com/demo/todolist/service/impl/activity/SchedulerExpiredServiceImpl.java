package com.demo.todolist.service.impl.activity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.todolist.dao.activity.UpdateActivityDao;
import com.demo.todolist.model.Activity;
import com.demo.todolist.service.activity.GetAllExpiredActivityForScheduler;
import com.demo.todolist.service.activity.SchedulerExpiredService;

@Service
public class SchedulerExpiredServiceImpl implements SchedulerExpiredService {
	@Autowired
	GetAllExpiredActivityForScheduler getAllExpiredActivityForScheduler;

	@Autowired
	UpdateActivityDao updateActivityDao;

	@Override
	public void expiredUpdate() {
		List<Activity> activities = getAllExpiredActivityForScheduler.getAllExpiredActivityForScheduler();
		if (activities.size() > 0) {
			for (Activity activity : activities) {
				activity.setIsActive(false);
				updateActivityDao.update(activity);
			}
		}
	}

}
