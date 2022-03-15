package com.qa.oop.Interfaces;

// can have infinite interfaces "," to seperate
public class Truck extends Vehicle implements Radio{
	
	private int numWheels; 
	private boolean hasTrailer; 

	public Truck(String type, int seats, String colour, int storageIn, int numWheels, boolean hasTrailer) {
		this.setType(type);
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
		return "Truck [numWheels=" + numWheels + ", hasTrailer=" + hasTrailer + ", getType()=" + getType()
				+ ", getSeats()=" + getSeats() + ", getColour()=" + getColour() + ", getStorageIn()=" + getStorageIn()
				+ "]";
	}

	@Override
	public double getTheBill() {
		// TODO Auto-generated method stub
		return this.getTheBill() * 600;
	}

	@Override
	public void radioOn() {
		System.out.println("Radio Playing");
		
	}

	@Override
	public void radioOff() {
		System.out.println("Radio not Playing");
		
	}
	
	

}
