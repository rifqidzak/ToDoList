package com.demo.todolist.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.demo.todolist.service.activity.SchedulerExpiredService;

@Component
@EnableAsync
public class ExpiredScheduler implements SchedulerExpiredService{
	@Autowired
	SchedulerExpiredService schedulerExpiredService;
	@Async
	@Scheduled(fixedRate = 10000)
	@Override
	public void expiredUpdate() {
		schedulerExpiredService.expiredUpdate();
	}
	
	
}
