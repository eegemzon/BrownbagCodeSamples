package com.accenture.intralot.brownbag.failfast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastIteration {

	public static void main(String[] args) {
		ArrayList<String> fruitList = new ArrayList<String>();
		fruitList.add("orange");
		fruitList.add("apple");
		fruitList.add("banana");
		fruitList.add("grapes");
		
		/*Iterator<String> fruitIterator = fruitList.iterator();
		while(fruitIterator.hasNext()){
			System.out.println(fruitIterator.next());
			fruitList.remove("banana");
		}
		*/
		CopyOnWriteArrayList<String> fruitSet = new CopyOnWriteArrayList<String>(fruitList);
		Iterator<String> fruitIterator = fruitList.iterator();
		while(fruitIterator.hasNext()){
			System.out.println(fruitIterator.next());
			fruitSet.remove("banana");
		}
		System.out.println("=============");
		fruitIterator = fruitSet.iterator();
		while(fruitIterator.hasNext()){
			System.out.println(fruitIterator.next());
		}
		
		
	}
	
}
