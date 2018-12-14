package com.accenture.intralot.brownbag.generics;

public class Variable<T> {

	private T variableName;
	
	public T getVariableName(){
		return this.variableName;
	}
	
	public void setVariableName(T variableName){
		this.variableName = variableName;
	}
	
}
