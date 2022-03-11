package com.qa.stringManipulation;

public class Runner {
	
	public static void main(String[] args) {
		
////		when comparing= will compare the value 
//		String myString = "Message";
//		String anotherString = "Message2";
//		
////		both objects would come out success as comparing both values 
//		if (myString == anotherString) {
//				System.out.println("SUCCESS!!");
				
//		two different objects so would not compare the value of the object but the object itself
			String myOString = new String("We are the Same");
			String anotherOString = new String("We are the Same");
			
			if (myOString == anotherOString) {
				System.out.println("SUCCESS!!");

	}
			if (myOString.equals(anotherOString)) {
				System.out.println("SUCCESS!!");

	}
//			Get the length of the string
			System.out.println(myOString.length());
			
			System.out.println();
			
			String thirdString = myOString + " " +anotherOString;
			System.out.println(thirdString);
			
			System.out.println();
			
			String fourthString = myOString.concat(" ").concat(anotherOString);
			System.out.println(fourthString);
			
			System.out.println();
			
//			(String, interger)is a non primative object interger= rapper class= can use "."
//			string, int is priative = just storing data = cant use "."
			
			
//			String Manipulation
			
//			SubString - will extract things from within other strings 
			System.out.println(thirdString.substring(3, 7));
			
			System.out.println();
			
//			cHange Case
			System.out.println(thirdString.toUpperCase());
			System.out.println(thirdString.toLowerCase());
			
			System.out.println();
			
//			get certain characters at a specific index
			System.out.println(thirdString.charAt(3));
			
			System.out.println();
//			get the position/index of a character if multiple will chose first instance 
			System.out.println(thirdString.indexOf("e"));
			
			System.out.println();
			
//			get the position/index of a character if multiple will the index start point
			System.out.println(thirdString.indexOf("e", 2));
			
//			starts with specific string using boolean
			System.out.println(thirdString.startsWith("W"));
			
			
}
}
