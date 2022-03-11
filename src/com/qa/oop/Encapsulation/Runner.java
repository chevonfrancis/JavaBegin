package com.qa.oop.Encapsulation;

public class Runner {
	
	public static void main(String[] args) {
	
		
		Person alex = new Person("Alex", 23, "Bank Manager");
		Person john = new Person("John", 34, "Associate Lawyer");
		Person mark = new Person("Mark", 12, "Customer Service Advisor");
		Person emily = new Person("Emily", 27, "Cashier");
		Person vanassa = new Person("Vanassa", 29, "International Relations");
		
		System.out.println(mark);
		System.out.println(alex);
		System.out.println(emily);
		System.out.println(vanassa);
		System.out.println(alex.getAge());
		System.out.println(emily.getJobTitle());
		
	
		
	}
}
