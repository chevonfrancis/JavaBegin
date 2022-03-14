package com.qa.oop.garageDemo;

public class Truck extends Vehicle {
	
	private int numWheels; 
	private boolean hasTrailer; 

	public Truck(int seats, String colour, int storageIn, int numWheels, boolean hasTrailer) {
		this.setSeats(seats);
		this.setColour(colour);
		this.setStorageIn(storageIn);
		
		this.numWheels = numWheels;
		this.hasTrailer = hasTrailer;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	public boolean isHasTrailer() {
		return hasTrailer;
	}

	public void setHasTrailer(boolean hasTrailer) {
		this.hasTrailer = hasTrailer;
	}

	@Override
	public String toString() {
		return "Truck [numWheels=" + numWheels + ", hasTrailer=" + hasTrailer + ", getSeats()=" + getSeats()
				+ ", getColour()=" + getColour() + ", storageIn=" + getStorageIn()+ "]";
	}
	
	

}
