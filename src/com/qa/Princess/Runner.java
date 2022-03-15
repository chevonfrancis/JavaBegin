package com.qa.Princess;

public class Runner {
	public static void main (String[] args) {
		
		DisneyPrincess p1 = new DisneyPrincess();
		p1.name = "Jasmine";
		p1.age = 14;
		p1.jobTitle = "Investigator";
		p1.fairyGodma();
		
		System.out.println();
		
		System.out.println("Name: " + p1.name + "\n" + "Age: " + p1.age + "\n" + "Job Title " + p1.jobTitle);
		
		DisneyPrincess p2 = new DisneyPrincess();
		p1.name = "Cinderella";
		p1.age = 16;
		p1.jobTitle = "Cleaner";
		p1.fairyGodma();
		
		DisneyPrincess p3 = new DisneyPrincess();
		p1.name = "Swan Princess";
		p1.age = 15;
		p1.jobTitle = "Feeder";
		p1.fairyGodma();
		
		
		DisneyPrincess p = new DisneyPrincess();
		p1.name = "Fiona";
		p1.age = 16;
		p1.jobTitle = "Zoo Keeper";
		p1.fairyGodma();
		
		

	
	}
}
