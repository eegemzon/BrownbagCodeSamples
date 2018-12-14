package com.sample.beans;

public class BeanLifecycle {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("bean initialized.");
	}
	
	public void destroy() {
		System.out.println("bean to be destroyed.");
	}
	
}
