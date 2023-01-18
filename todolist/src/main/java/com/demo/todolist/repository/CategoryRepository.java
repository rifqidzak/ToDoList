package com.demo.todolist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.todolist.model.Category;


public interface CategoryRepository extends JpaRepository<Category, String>{
    @Query(value = "select * from t_category", nativeQuery = true)
	List<Category> getAllByCommentsId();
    int removeById(String id);
}
