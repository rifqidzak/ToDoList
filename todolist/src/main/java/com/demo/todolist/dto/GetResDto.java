package com.demo.todolist.dto;

public class GetResDto<T> {
    private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
