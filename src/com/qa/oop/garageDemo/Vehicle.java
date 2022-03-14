package com.qa.oop.garageDemo;

public class Vehicle {
	
	private int seats;
	private String colour;
	private int storageIn;
	
	public Vehicle() {}
	
	
	public Vehicle(int seats, String colour, int storageIn) {
		this.seats = seats;
		this.colour = colour;
		this.storageIn = storageIn;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getStorageIn() {
		return storageIn;
	}

	public void setStorageIn(int storageIn) {
		this.storageIn = storageIn;
	}

	@Override
	public String toString() {
		return "Vehicle [seats=" + seats + ", colour=" + colour + ", Storage Inches= " + storageIn + "]";
	}
	
	
	

}
