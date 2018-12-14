package com.accenture.intralot.brownbag.generics;

public class GenericMain {

	public static void main(String[] args) {
		
		/*
		 * Using the generic on the initialization
		 * This is more readable
		 * This is secured, meaning, only String types are allowed
		 * Other types are not allowed, any class or primitive types
		 */
		Variable<String> stringVariableType = new Variable<String>();
		String strTemp = "Some String for a String Variable type";
		stringVariableType.setVariableName(strTemp);
		System.out.println(stringVariableType.getVariableName());
		int numbertype = 1;
		
		
		/*
		 * Without using generics on the initialization
		 */
		Variable unknownVariableType = new Variable();
		strTemp = "Some String for unknown variable";
		unknownVariableType.setVariableName(strTemp);
		System.out.println(unknownVariableType.getVariableName());
		
		/*
		 * Accepts primitive
		 */
		int integertype = 100;
		unknownVariableType.setVariableName(integertype);
		System.out.println(unknownVariableType.getVariableName());
		
		
		
		
		
	}
	
}
