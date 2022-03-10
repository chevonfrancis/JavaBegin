package com.qa.scope;

public class Scope {

	public String message = "hello";

	public void methodOne() {
//		This is a local scope (method scope)
		String message = "Goodbye";
		System.out.println(message);
		
	}
	
	public void methodTwo(String message) {
		System.out.println(message);
	}
}

