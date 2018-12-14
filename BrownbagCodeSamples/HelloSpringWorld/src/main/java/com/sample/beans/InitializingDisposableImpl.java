package com.sample.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InitializingDisposableImpl implements InitializingBean, DisposableBean {
	
	@Override
	public void afterPropertiesSet() {
		System.out.println("Initializing Bean: afterPropertiesSet method.");
	}

	@Override
	public void destroy() {
		System.out.println("Disposable Bean: destroy method.");
	}
	
	public void printMessage() {
		System.out.println("Bean message: Hi, I implemented InitializingBean and DisposableBean Interfaces.");
	}
	
}
