package com.qa.oop.garageDemo;

public class MotorBike extends Vehicle{
	
	private int maxMPH; 
	private String type; 

	public MotorBike(int seats, String colour, int storageIn, int maxMPH, String type) {
		this.setSeats(seats);
		this.setColour(colour);
		this.setStorageIn(storageIn);
		
		this.maxMPH = maxMPH;
		this.type = type;
		
		
	}

	public int getMaxMPH() {
		return maxMPH;
	}

	public void setMaxMPH(int maxMPH) {
		this.maxMPH = maxMPH;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "MotorBike [maxMPH=" + maxMPH + ", type=" + type + ", getSeats()=" + getSeats() + ", getColour()="
				+ getColour() +  ", storageIn=" + getStorageIn() + "]";
	}

	
	}
	
	


