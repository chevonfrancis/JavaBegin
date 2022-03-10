package com.qa.constructors;
// instance members --> them make objects in runner 
public class Person {

////	does not have a return type- so leave it out as void is returning "no Return"
//	public Person() {
//		
//	}
	public String name;
	public int age;
	public String colour;
	public int shoeSize;
	public boolean girl = true; 
	
	public Person() {}
 
//	when you dont want to put a name in runner it allows variety 
	public Person(int age, int shoeSize) {
		this.age = age;
		this.shoeSize = shoeSize;
	}
	
	public Person(String name, int age, String colour,  int shoeSize, boolean girl) {
		this.name = name;
		this.age = age;
		this.colour = colour; 
		this.shoeSize = shoeSize; 
		this.girl = girl; 
	}
}
