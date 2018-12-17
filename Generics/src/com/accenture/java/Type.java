package com.accenture.java;

public class Type<T> {

	private T data;

	public Type(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
