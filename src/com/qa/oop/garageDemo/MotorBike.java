package com.qa.oop.garageDemo;

public class MotorBike extends Vehicle{
	
	private int maxMPH; 
	private String bikeType; 

	public MotorBike(String type, int seats, String colour, int storageIn, int maxMPH, String bikeType) {
		this.setType(bikeType);
		this.setSeats(seats);
		this.setColour(colour);
		this.setStorageIn(storageIn);
		
		this.maxMPH = maxMPH;
		this.bikeType = bikeType;
		
		
	}

	public int getMaxMPH() {
		return maxMPH;
	}

	public void setMaxMPH(int maxMPH) {
		this.maxMPH = maxMPH;
	}

	public void setType(String bikeType) {
		this.bikeType = bikeType;
	}
	
	


	@Override
	public String toString() {
		return "MotorBike [maxMPH=" + maxMPH + ", Bike type=" + bikeType + ", getType()=" + getType() + ", getSeats()="
				+ getSeats() + ", getColour()=" + getColour() + ", getStorageIn()=" + getStorageIn() + "]";
	}

	@Override
	public double getTheBill() {
		// TODO Auto-generated method stub
		return this.getMaxMPH() * 125;
	}

	
	}
	
	


