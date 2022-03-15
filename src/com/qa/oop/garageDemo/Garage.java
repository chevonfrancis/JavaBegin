package com.qa.oop.garageDemo;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
//	a list of vehicle(parent type)
		List<Vehicle> Garage = new ArrayList<Vehicle>();
		
		
		public String getTheBill() {
			for (Vehicle vehicle : Garage) {
				return "Vehicle: " + vehicle.toString() + "Get the BILL " + getBill(vehicle);
			}
		public int getBill(Vehicle vl) {
			int bill = 25;
			if(vl instanceof Car) {
				bill *= 100;
			}else if (vl instanceof MotorBike) {
				bill *= 10;
			}else if (vl instanceof Truck) {
				bill *= 250;
			}return bill;
		
		}
		
		public void addVehicle(Vehicle vl) {
		this.Garage.add(vl);
		
		}
		
		
		public void removeVehicleType(String type) {
			ArrayList<Vehicle> found = new ArrayList<Vehicle>();
			
			for (Vehicle vehicle : vl) {
		}if (Vehicle.getType().equals(type)) {
			found.add(Vehicle);
		}
		
		
		
			if (this.Garage.remove(vl)) {
				System.out.println("Vehicle Removed");
			}else 
				System.out.println("Vehicle not here");
		}

		
		
		
	}



