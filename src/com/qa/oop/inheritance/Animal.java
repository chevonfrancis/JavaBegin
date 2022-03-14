package com.qa.oop.inheritance;

// this is now an abstract class now so that now this is just sharing tool for the children
// 
public abstract class Animal {
	
	private int age;
	private int numofLegs;
	private String colour;
	
//	this is the default constructor when using 
	public Animal () {}
	
	public Animal(int age, int numofLegs, String colour) {
//		this super class constructor default does not have to be here when empty
		super();
		this.age = age;
		this.numofLegs = numofLegs;
		this.colour = colour;
	}
// getters and setters so that the private methods can be used publically 
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumofLegs() {
		return numofLegs;
	}

	public void setNumofLegs(int numofLegs) {
		this.numofLegs = numofLegs;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
//	this would be if we didnt want it to be abstract and we would have to ensure all children classes have changecolour method 
//	public void changeColour();
//	the purpose of this method was to be inherited by children class to override- also make the method and class abstract
	public abstract void changeColour();

	@Override
	public String toString() {
		return "Animal [age=" + age + ", numofLegs=" + numofLegs + ", colour=" + colour + "]";
	}
	
	
	

}
