package com.qa.oop.garageDemo;

public abstract class Vehicle {
	
	private String type;
	private int seats;
	private String colour;
	private int storageIn;
	
	public Vehicle() {}
	
	
	public Vehicle(int seats, String colour, int storageIn) {
		this.seats = seats;
		this.colour = colour;
		this.storageIn = storageIn;
	}

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
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
	
	public abstract double getTheBill();


	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", seats=" + seats + ", colour=" + colour + ", storageIn=" + storageIn + "]";
	}

	

	
	
	

}
