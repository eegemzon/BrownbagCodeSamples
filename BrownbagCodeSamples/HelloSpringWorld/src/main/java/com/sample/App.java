package com.sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.sample.beans.BeanLifecycle;
import com.sample.beans.HelloSpring;
import com.sample.beans.InitializingDisposableImpl;
import com.sample.beans.Prototype;

/**
 * Hello world! 
 * XmlBeanFactory is deprecated as of version 4
 */

@SuppressWarnings("deprecation")
public class App {

	public static void main(String[] args) {
		
		//IOC Containers
		/*classPathXmlApplicationContext();*/
		
		//xmlBeanFactory();
		
		//fileSystemXmlApplicationContext();
		
		//scope
		beanScoping();
		
		//injectProtoIntoSingle();
		
		//Lifecycle
		//beanLifecycleDemo();
		
		//bean inheritance
		//beanInheritance();
		
		//autowiring
		//autowireMe();
	}

	public static void classPathXmlApplicationContext() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean-ApplicationContextClassPath.xml");
		HelloSpring helloSpringObject = (HelloSpring) context.getBean("helloSpring");
		context.close();
		System.out.println(helloSpringObject.getObjMessage().getMessage());
	}

	public static void xmlBeanFactory() {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("bean-beanFactory.xml"));
		HelloSpring helloSpringObject = (HelloSpring) factory.getBean("helloSpring");
		System.out.println(helloSpringObject.getObjMessage().getMessage());
	}
	
	public static void fileSystemXmlApplicationContext() {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("file:C:\\Development\\SpringBrownbag\\HelloSpringWorld\\src\\main\\resources\\bean-FileSystemXmlApplicationContext.xml");
		HelloSpring helloSpringObject = (HelloSpring) context.getBean("helloSpring");
		context.close();
		System.out.println(helloSpringObject.getObjMessage().getMessage());
	}
	
	/**
	 * demonstrate Singleton and Prototype
	 */
	public static void beanScoping() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean-ApplicationContextClassPath.xml");
		
		//prototype scope
		Prototype proto = (Prototype) context.getBean("prototypeObj");
		System.out.println(proto.getMessage());
		
		proto.setMessage("I am a new prototype message.");
		System.out.println(proto.getMessage());
		
		proto = (Prototype) context.getBean("prototypeObj");
		System.out.println(proto.getMessage());
		
		//singleton scope
		HelloSpring helloSpringObj = (HelloSpring) context.getBean("helloSpring");
		System.out.println(helloSpringObj.getObjMessage().getMessage());
		
		helloSpringObj.getObjMessage().setMessage("new message for helloSpring object");
		System.out.println(helloSpringObj.getObjMessage().getMessage());
		
		helloSpringObj = (HelloSpring) context.getBean("helloSpring");
		System.out.println(helloSpringObj.getObjMessage().getMessage());
		
		context.close();
	}
	
	/**
	 * Injecting a prototype scoped bean into a Singleton
	 */
	public static void injectProtoIntoSingle() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean-ApplicationContextClassPath.xml");
		HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpringSingle");
		System.out.println(helloSpring.getObjMessage().getMessage());
		
		helloSpring.getObjMessage().setMessage("Something new for prototype message");
		System.out.println(helloSpring.getObjMessage().getMessage());
		
		helloSpring = (HelloSpring) context.getBean("helloSpringSingle");
		System.out.println(helloSpring.getObjMessage().getMessage());
		
		context.close();
	}
	
	/**
	 * Bean Lifecycle demo
	 */
	public static void beanLifecycleDemo() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean-lifecycle.xml");
		BeanLifecycle beanLife = (BeanLifecycle) context.getBean("beanLifecycleInitDestroy");
		System.out.println(beanLife.getMessage());
		
		InitializingDisposableImpl initializingDisposableImpl = (InitializingDisposableImpl) context.getBean("initializingDisposableImpl");
		initializingDisposableImpl.printMessage();
	
		context.close();
	}
	
	/**
	 * Bean inheritance
	 */
	public static void beanInheritance() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean-ApplicationContextClassPath.xml");
		HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpring");
		System.out.println("Hello from Spring: " + helloSpring.getObjMessage().getMessage());
		
		Prototype proto = (Prototype) context.getBean("prototypeObj");
		System.out.println("Proto: " + proto.getMessage());
		context.close();
	}
	
	/**
	 * Autowire by name, type or constructor
	 */
	public static void autowireMe() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean-ApplicationContextClassPath.xml");
		HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpring");
		System.out.println("Hello from Spring: " + helloSpring.getObjMessage().getMessage());
		context.close();
	}
	
}
