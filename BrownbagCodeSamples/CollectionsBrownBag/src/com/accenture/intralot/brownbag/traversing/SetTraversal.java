package com.accenture.intralot.brownbag.traversing;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class SetTraversal {

	public static void main(String[] args) {

		/*HashSet<String> set = new HashSet<String>();
		set.add("Java");
		set.add("Java"); //THIS IS A DUPLICATE!!!!!!!!!!!
		set.add("C++");
		set.add("PHP");
		set.add("ETL");
		set.add(".net");
		set.add("PLSQL");
		set.add("SystemTest");
		set.add("PLSQL");// ANOTHER DUPLICATE!!!!!!!!!!!!!!!!
*/		
		TreeSet<String> set = new TreeSet<String>();
		set.add("Java");
		set.add("Java"); //THIS IS A DUPLICATE!!!!!!!!!!!
		set.add("C++");
		set.add("PHP");
		set.add("ETL");
		set.add(".net");
		set.add("PLSQL");
		set.add("SystemTest");
		set.add("PLSQL");// ANOTHER DUPLICATE!!!!!!!!!!!!!!!!
		
		
		
		// Lambda Expression
		System.out.println("Lambda forEach");
		set.forEach((str) -> {
			System.out.println(str);
		});

		
		// Another lambda grrr
		System.out.println("=================================");
		System.out.println("Another Lambda forEach");
		set.forEach(System.out::println);

		
		// Enhanced For Loop (For Each)
		System.out.println("=================================");
		System.out.println("Simple for-each loop");
		for (Object str : set) {
			System.out.println(str);
		}

		
		System.out.println("=================================");
		System.out.println("Using Iterator");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		/*
		 * Difference of Enumeration and Iterator
		 * Enumeration is read-only 
		 * while Iterator can modify a collection
		 */
		System.out.println("=================================");
		System.out.println("Using enumeration");
		Enumeration<String> listEnum = Collections.enumeration(set);
		while(listEnum.hasMoreElements()){
			System.out.println(listEnum.nextElement());
		}
		
		
	}
	
}

