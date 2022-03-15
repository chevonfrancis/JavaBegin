package com.qa.oop.Interfaces;

public class Car extends Vehicle {
	
	private int doors;
	private String model;

	public Car(String type, int seats, String colour, int storageIn, int doors, String model) {
		this.setType(type);
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
		return "Car [doors=" + doors + ", model=" + model + ", getType()=" + getType() + ", getSeats()=" + getSeats()
				+ ", getColour()=" + getColour() + ", getStorageIn()=" + getStorageIn() + "]";
	}

	@Override
	public double getTheBill() {
		// TODO Auto-generated method stub
		return this.getTheBill() * 750;
	}
	
	

}
