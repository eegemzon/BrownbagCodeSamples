package com.sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

	public static void main( String[] args ) {
        
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
    	
    	HelloWorld hello = (HelloWorld)context.getBean("helloWorld");
    	
    	System.out.println(hello.getMessage().getMessage());
    	
    	context.close();
    	
    }
}
