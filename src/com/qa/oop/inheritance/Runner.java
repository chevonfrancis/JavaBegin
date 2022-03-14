package com.qa.oop.inheritance;

import java.util.List;
import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		
		Unicorn uri = new Unicorn(2, 2, "pink", "gold", false);
		Rabbit badBunni = new Rabbit();
		
		uri.changeColour();
		
		System.out.println(uri);
		
		List<Animal> listOfAnimals = new ArrayList<>();
		listOfAnimals.add(uri);
		
		
		
		

	}

}
