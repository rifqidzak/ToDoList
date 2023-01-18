package com.demo.todolist.dto;

public class InsertResDto {
    private InsertResDataDto data;
	private String message;

	public InsertResDataDto getData() {
		return data;
	}

	public void setData(InsertResDataDto data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
