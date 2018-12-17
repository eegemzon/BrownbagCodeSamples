package com.accenture.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		Type typeString = new Type("Gemzon");
		Type typeInt = new Type(new Integer(10));		
		Type type = new Type(new Long(1000000000));
		
		//String name = typeString.getData();
		//String name = (String) typeString.getData(); 
		
		//Integer randomNumber = typeInt.getData();
		//Integer randomNumber = (Integer) typeInt.getData();
		
		// What if we don't know the type of data the specific object contains and try to run it
		// Compile time won't be a problem (so we are not protected, and then we deploy it to prod)
		Integer random = (Integer) type.getData();
		
		/* Using Generics: Uncomment lines below and comment out codes above
		  Type<String> typeString = new Type<>("Gemzon");
			Type<Integer> typeInt = new Type<>(new Integer(10));		
			Type<Long> type = new Type<>(new Long(1000000000));
			
			// No need for explicit casting that is very problematic for complex or big applications consisting
			// of different modules or systems
			String name = typeString.getData();
			Integer randomNumber = typeInt.getData();
			
			// And this problem will be eliminated during compile time
			Integer random = (Integer) type.getData();
		*/
		
		
		
		
		
		
		
		// Generic Methods
		//genericVoidMethod("An object");
		//int numeric = genericWrapperMethod(new Integer(10));
		//System.out.println("numeric: " + numeric);
		
		// Long, Integer, Bytes... are subclasses of java.lang.Number class
		//Long longNum = returnBoundedGeneric(new Long(1000000));
		//Integer intNum = returnBoundedGeneric(new Integer(100));
		
		//List<String> listOfString = new ArrayList<>(Arrays.asList("string1", "string2"));
		//List<Integer> listOfInts = new ArrayList<>(Arrays.asList(1, 2));
		//genericsForParameters(listOfString);
		//genericsForParameters(listOfInts);
	}

	public static <T> void genericVoidMethod(T obj) {
		System.out.println("Print something: " + obj.toString());
	}
	
	public static <T> T genericWrapperMethod(T obj) {
		return obj;
	}
	
	public static <T extends Number> T returnBoundedGeneric(T obj) {
	    return obj;
	}
	/*
	// extends Class & Interfaces...
	// Wrapper classes extends from Number and implements Serializable and Comparable interfaces
	public static <T extends Number & Serializable & Comparable> T returnBoundedGeneric(T obj) {
	    return obj;
	}
	*/
	
	// List<Object> is not a superclass of List<String> even though Object is the superclass of all objects
	public static void genericsForParameters(List<? extends Object> obj) {
		System.out.println("do something");		
	}
}



