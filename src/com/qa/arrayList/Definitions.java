package com.qa.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Definitions {
	
	public static void main(String[] args) {
		
//		how we create a new arrayList
		List<String> listOfStrings = new ArrayList<>();
		
////		returns a immutable list
//		list.of("Hello", "There");
//		
////		returns a regular list
//		array.aslist("Hello", "There");
		
//		how to add to the list 
		listOfStrings.add("Hello");
		listOfStrings.add("There"); 
		listOfStrings.add("Favorite"); 
		listOfStrings.add("Person"); 
		
//		how to get the specific values 
		System.out.println(listOfStrings.get(1));
		
//		how to change the value at a specific position
		listOfStrings.set(0, "Beautiful");
		System.out.println(listOfStrings.get(0));
		
//		looping through an array list - can specify what you want to print 
		for (int i = 0; i < listOfStrings.size(); i++) {
			System.out.println(listOfStrings.get(i));
		}
		
//		for each loop  -all the string in this loops i would like to print (same as above)
		for(String str : listOfStrings) {
			System.out.println(str);
		}
		
	}

}
