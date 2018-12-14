package com.accenture.intralot.brownbag.traversing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapTraversal {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "Eineil");
		map.put("company", "Accenture");
		map.put("Location", "Eastwood");
		
		System.out.println("get the value of company: " + map.get("company"));
		
		/*TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("A Name", "Eineil");
		map.put("C Location", "Eastwood");
		map.put("B Company", "Accenture");*/
		
		//forEach and Lambda
		System.out.println("Lambda way aghh");
		map.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));
		
		System.out.println("=========================");
		
		//Using Map.Entry and Iterator
		System.out.println("Using Iterator");
		//returns set then access iterator method to return iterator object
		Iterator<Entry<String, String>> iterator = map.entrySet().iterator(); 
		while(iterator.hasNext()){
			Map.Entry<String, String> entry = iterator.next();
			System.out.println("Key: "+ entry.getKey() + ", Value: " + entry.getValue());
		}
		
		System.out.println("=========================");
		
		System.out.println("Using for each loop");
		for(Map.Entry<String, String> tmpEntry : map.entrySet()){
			System.out.println("Key: "+ tmpEntry.getKey() + ", Value: " + tmpEntry.getValue());
		}
		
		System.out.println("=========================");
		System.out.println("By getting all the keys");
		for(String key : map.keySet()){
			System.out.println("Key: "+ key + ", Value: " + map.get(key));
		}
			
		
	}
	
}
