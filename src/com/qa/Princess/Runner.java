package com.qa.Princess;

public class Runner {
	public static void main (String[] args) {
		
		DisneyPrincess p1 = new DisneyPrincess();
		p1.name = "Jasmine";
		p1.hairColour = "black";
		p1.dressSize = 8;
		p1.poshLevel = 10; 
		
		p1.fairyGodma();
		
		System.out.println();
		
		System.out.println("Name: " + p1.name + "\n" + "Hair Colour: " + p1.hairColour + "\n" + "How Posh is She? " + p1.poshLevel);
		
		DisneyPrincess p2 = new DisneyPrincess();
		p2.name = "Cinderella";
		p2.hairColour = "brown";
		p2.dressSize = 7;
		p2.poshLevel = 3; 

	
	}
}
