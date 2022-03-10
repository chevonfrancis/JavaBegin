package com.qa.constructors;

public class Runner {

	public static void main(String[] args) {
		
//		 star
		Person chevon = new Person("Chevon", 28, "Pink", 4, true);
		System.out.println("Name: " + chevon.name);
		System.out.println("Age: " + chevon.age);
		System.out.println("Colour: " + chevon.colour);
		System.out.println("Shoe Size: " + chevon.shoeSize);
		System.out.println("Female: " + chevon.girl);
		
		System.out.println();
		
//		this constructor will be used a default values 
		Person p = new Person();
		System.out.println("Name: " + p.name);
		System.out.println("Age: " + p.age);
		System.out.println("Colour: " + p.colour);
		System.out.println("Shoe Size: " + p.shoeSize);
		
		
	}
}
