package com.demo.todolist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.demo.todolist.model.Activity;

public interface ActivityRepository extends JpaRepository<Activity, String>{
    @Query(value = "select * from t_activity inner join t_category ON t_activity.category_id = t_category.id where t_activity.is_active = true", nativeQuery = true)
	List<Activity> getAllActiveSchedule();

    @Query(value = "select * from t_activity inner join t_category ON t_activity.category_id = t_category.id where end_time < now() AND t_activity.is_active = true", nativeQuery = true)
    List<Activity> getAllExpiredByTimeForScheduler();
    
    @Query(value = "select * from t_activity inner join t_category ON t_activity.category_id = t_category.id where t_activity.is_active = false", nativeQuery = true)
	List<Activity> getExpiredActivity();

    @Query(value = "select * from t_activity inner join t_category ON t_activity.category_id = t_category.id where t_activity.is_active = true AND t_category.id = :categoryId", nativeQuery = true)
	List<Activity> getAllActivityByCategoryActive(@Param("categoryId") String categoryId);

    @Query(value = "select * from t_activity inner join t_category ON t_activity.category_id = t_category.id where t_activity.is_active = false AND t_category.id = :categoryId", nativeQuery = true)
	List<Activity> getAllActivityByCategoryExpired(@Param("categoryId") String categoryId);

    

    int removeById(String id);
}
