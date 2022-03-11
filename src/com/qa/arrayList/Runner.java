package com.qa.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	
	public static void main(String[] args) {
		
		List<String> listOfAnimals = new ArrayList<>();
		
		listOfAnimals.add("Elephant");
		listOfAnimals.add("Monkey");
		listOfAnimals.add("Rabbit");
		listOfAnimals.add("Unicorn");
		listOfAnimals.add("Cheetah");
		
		System.out.println("Original order:     " + listOfAnimals);
		
		System.out.println();
		
		for(String str : listOfAnimals) {
			System.out.println(str);
		}
		
		System.out.println();
		
		System.out.println(listOfAnimals.get(1));
		
		System.out.println();
		
		
		
	}

}
