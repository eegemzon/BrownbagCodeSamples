package com.accenture.intralot.brownbag.traversing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class ListTraversal {
	public static void main(String[] args) {

		/*
		 * New Java Version should be parameterized ex. ArrayList<String> The
		 * code below shows generic type which accepts any types
		 */
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("PHP");
		list.add(".Net");
		list.add("PLSQL");
		list.add("ETL");
		list.add("SystemTest");
		list.add("C++");
		list.add("Java"); //duplicate of the first element
		
		
		/*
		LinkedList<Integer> list = new LinkedList<Integer>();
		//for the sake of a simple example. Alternatively you can use list.add(new Integer(1)) ...
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.addFirst(0);
		list.addLast(6);
		*/		
		
		// Lambda Expression
		System.out.println("Lambda forEach");
		list.forEach((str) -> {
			System.out.println(str);
		});

		
		// Another lambda grrr
		System.out.println("=================================");
		System.out.println("Another Lambda forEach");
		list.forEach(System.out::println);

		
		// Enhanced For Loop (For Each)
		System.out.println("=================================");
		System.out.println("Simple for-each loop");
		for (Object str : list) {
			System.out.println(str);
		}

		
		System.out.println("=================================");
		System.out.println("Using Iterator");
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		
		/*
		 * listiterator is applicable only to Classes implementing the List
		 * Interface such as (LinkedList, ArrayList)
		 */ 
		System.out.println("=================================");
		System.out.println("Forward with ListIterator");
		ListIterator listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		
		/*
		 * backwards, index or List 'pointer' (not to be mistaken for C/C++
		 * pointers) is at the end of the list.
		 */
		System.out.println("=================================");
		System.out.println("BACKWARDS FOR LISTITERATOR");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		
		/*
		 * Difference of Enumeration and Iterator
		 * Enumeration is read-only 
		 * while Iterator can modify a collection
		 */
		System.out.println("=================================");
		System.out.println("Using enumeration");
		Enumeration listEnum = Collections.enumeration(list);
		while(listEnum.hasMoreElements()){
			System.out.println(listEnum.nextElement());
		}
		
		System.out.println("=================================");
		System.out.println("Using simple for-loop");
		for(int index = 0 ; index < list.size() ; index++){
			System.out.println(list.get(index));
		}

	}
}
