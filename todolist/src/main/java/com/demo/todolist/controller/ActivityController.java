package com.demo.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.todolist.dto.GetResDto;
import com.demo.todolist.dto.InsertResDto;
import com.demo.todolist.dto.UpdateResDto;
import com.demo.todolist.dto.activity.GetActivityDataDto;
import com.demo.todolist.dto.activity.InsertActivityDto;
import com.demo.todolist.dto.activity.UpdateActivityDto;
import com.demo.todolist.service.activity.GetAllActivityActiveService;
import com.demo.todolist.service.activity.GetAllActivityByCategoryActiveService;
import com.demo.todolist.service.activity.GetAllActivityByCategoryExpiredService;
import com.demo.todolist.service.activity.GetAllActivityExpiredService;
import com.demo.todolist.service.activity.GetByIdActivityService;
import com.demo.todolist.service.activity.GetSearchingActivityActive;
import com.demo.todolist.service.activity.GetSearchingActivityExpired;
import com.demo.todolist.service.activity.InsertActivityService;
import com.demo.todolist.service.activity.UpdateActivityService;

@RestController
@RequestMapping("activity")
public class ActivityController {
	@Autowired
	private GetAllActivityByCategoryActiveService getAllActivityByCategoryActiveService;
	@Autowired
	private GetAllActivityActiveService getAllActivityActiveService;
	@Autowired
	private GetAllActivityByCategoryExpiredService getAllActivityByCategoryExpiredService;
	@Autowired
	private InsertActivityService insertActivityService;
	@Autowired
	private GetAllActivityExpiredService getAllActivityExpiredService;
	@Autowired
	private GetByIdActivityService getByIdActivityService;
	@Autowired
	private UpdateActivityService updateActivityService;
	@Autowired
	private GetSearchingActivityActive getSearchingActivityActive;
	@Autowired
	private GetSearchingActivityExpired getSearchingActivityExpired;
	
	@GetMapping
	public ResponseEntity<GetResDto<List<GetActivityDataDto>>> getAllActive(@RequestParam Boolean active, @RequestParam(required = false) String categoryCode) {
		GetResDto<List<GetActivityDataDto>> data = new GetResDto<>();
		if(categoryCode == null) {
			if (active) {
				data = getAllActivityActiveService.getAllActivityActive();
			} else {
				data = getAllActivityExpiredService.getAllActivityExpired();
			}
		}
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@GetMapping("category")
	public ResponseEntity<GetResDto<List<GetActivityDataDto>>> getAllActivityByCategoryActive(
			@RequestParam String categoryId, @RequestParam Boolean active) {
		GetResDto<List<GetActivityDataDto>> data = new GetResDto<>();
		if(active) {
			data = getAllActivityByCategoryActiveService.getAllActivityByCategoryActive(categoryId);
		}else {
			data = getAllActivityByCategoryExpiredService.getAllActivityByCategoryExpired(categoryId);
		}
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@GetMapping("search")
	public ResponseEntity<GetResDto<List<GetActivityDataDto>>>search(@RequestParam String title, @RequestParam Boolean active){
		GetResDto<List<GetActivityDataDto>> data = new GetResDto<>();
		if(active) {
			data = getSearchingActivityActive.getSearchingActivityActive(title);
		}else {
			data = getSearchingActivityExpired.getSearchingActivityActive(title);
		}
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<InsertResDto> insert(@RequestBody InsertActivityDto data) {
		final InsertResDto result = insertActivityService.insert(data);
		return new ResponseEntity<>(result, HttpStatus.CREATED);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<GetResDto<GetActivityDataDto>> getById(@PathVariable String id) {
		final GetResDto<GetActivityDataDto> data = getByIdActivityService.getByIdActivity(id);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<UpdateResDto>update(@RequestBody UpdateActivityDto data){
		final UpdateResDto result = updateActivityService.update(data);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
