package com.qa.helloworld;

public class Runner {

	public static void main(String[] args) {
		
		char myChar = 'a';
		char myCharTwo = 'b';
	
//	Decimal default to double 
		System.out.println(10.999);

//		FLoats must be labelled with 'f'
		float myDecimal = 10.999f;
		
		
//		objects such as string contain useful methods 
		String myString = "Hello"; 
		
//		example of a string. dropdown menu
		System.out.println(myString.toLowerCase());
		
//		wrapper classes- used to wrap primative in objects,  so they can become methods
		Float objectFloat = myDecimal;
		Integer objectInt = 5;
		Long onjectLong = 10L;
		Double objectDouble = 10.5;
		Byte objectByte = 1;
		Short objectShort = 5;
		
		
		
	}
	

}
