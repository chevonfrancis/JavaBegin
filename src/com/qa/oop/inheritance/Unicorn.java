package com.qa.oop.inheritance;

public class Unicorn extends Animal {
	
	
	private String hornColour;
	private boolean isWhite; 
	
	public Unicorn(int age, int numofLegs, String colour, String hornColour, boolean isWhite) {
//		super(age, numofLegs, colour);
//		these are bothe the same but either can be used, either super or below 
		this.setAge(age);
		this.setNumofLegs(numofLegs);
		this.setColour(colour);
	
		this.hornColour = hornColour;
		this.isWhite = isWhite;
		
	}
	
// always use your getters and setters to get encapsulation when using private 
	public String getHornColour() {
		return hornColour;
	}


	public void setHornColour(String hornColour) {
		this.hornColour = hornColour;
	}


	public boolean isWhite() {
		return isWhite;
	}


	public void setWhite(boolean isWhite) {
		this.isWhite = isWhite;
	}
	
//	because the method is abstract in animal class this method has to be in all child classes 
	@Override
	public void changeColour() {
		System.out.println("Change White!!!");
	}


	@Override
	public String toString() {
		return "Unicorn [ Horn Colour= " + hornColour + ", Is it White= " + isWhite + ", Age= " + this.getAge()
				+ ", Number of Legs= " + this.getNumofLegs() + ", Colour= " + this.getColour() + "]";
	}
	
	

}
