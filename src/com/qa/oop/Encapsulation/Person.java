package com.qa.oop.Encapsulation;

public class Person {
	

	private String name;
	private int age;
	private String jobTitle;
	
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	public String getName() {
		return name;
	}
	
	public void getName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	public void getAge(int age) {
		this.age = age;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	
	public void getJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public String toString() {
		return "Person Name = " + name + " , Age = " + age + ", Job Title = " + jobTitle ; 
	}
}
