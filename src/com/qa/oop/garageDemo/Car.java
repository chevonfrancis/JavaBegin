package com.qa.oop.garageDemo;

public class Car extends Vehicle {
	
	private int doors;
	private String model;

	public Car(int seats, String colour, int storageIn, int doors, String model) {
		this.setSeats(seats);
		this.setColour(colour);
		this.setStorageIn(storageIn);
		
		this.doors = doors;
		this.model = model;
		
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [doors=" + doors + ", model=" + model + ", getSeats()=" + getSeats() + ", getColour()="
				+ getColour() +  ", storageIn=" + getStorageIn() + "]";
	}
	
	

}
