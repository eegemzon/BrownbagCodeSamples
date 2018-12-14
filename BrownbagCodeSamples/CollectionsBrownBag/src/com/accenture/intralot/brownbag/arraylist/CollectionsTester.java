package com.accenture.intralot.brownbag.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollectionsTester {

	public static void main(String[] args) {

		/*
		 * New Java Version should be parameterized ex. ArrayList<String> The
		 * code below shows generic type which accepts any types
		 */
		ArrayList list = new ArrayList();
		list.add("Java");
		list.add("Java");
		list.add("PHP");
		list.add(".Net");
		list.add("PLSQL");
		list.add("ETL");
		list.add("SystemTest");
		list.add("C++");	
		
		// Integer not integer, does not accept primitive data type (int, byte, short, double, ....).
		list.add(1);
		
		if (list.get(8) instanceof Integer) {
			System.out.println("1 is Integer object");
		}
				
		LinkedList otherList = new LinkedList(list);
			
		System.out.println("Collection copy example");
		for(Object str : otherList){
			System.out.println(str);
		}
		System.out.println("======================");	
		
		/*
		 * note the == operator instead of .equals method of String. This is
		 * because we are checking if they are the same objects, not the value
		 * they contain (which will also be TRUE as a result for this example).
		 */
		if (list.get(0) == list.get(1)) {
			System.out.println("'Java' and 'Java' are the same objects.");
		}		
		
		/*
		 * generics are specified, you can change the Object to the specific
		 * Data type of the collection, String for this example
		 */
		for (Object str : list) {
			System.out.println(str);
		}	
		
		//reversing order 
		System.out.println("======================");	
		System.out.println("Another manipulation");
		Collections.reverse(list);
		for(Object tmp : list){
			System.out.println(tmp);
		}
		
		//Convert Array to a List	
		System.out.println("======================");
		System.out.println("Simple array to List Collection");
		String[] stringArray = {"element1", "element2" , "element3"}; 
		List<String> arraylist = Arrays.asList(stringArray);
		for(String str : arraylist){
			System.out.println(str);
		}
		
		System.out.println("====================");
		System.out.println("Using collections sort");
		Collections.sort(list);
		for(Object str : list ){
			System.out.println(str);
		}

	}

}
