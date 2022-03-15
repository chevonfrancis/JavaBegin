package com.qa.oop.garageDemo;

public class Runner {

	public static void main(String[] args) {
		
		MotorBike scooter1 = new MotorBike("Sco1", 2, "Blue", 50, 140, "Scooter");
		System.out.println(scooter1);
		
		MotorBike scooter2 = new MotorBike("Sco2", 3, "Purple", 150, 220, "Cruiser");
		System.out.println(scooter2);
		
		
		Car car1 = new Car("Car1", 5, "Red", 750, 4, "X- Trail");
		System.out.println(car1);
		
		Car car2 = new Car("Car2", 2, "Black", 500, 2, "Boxster");
		System.out.println(car2);
		

		Truck truck1 = new Truck("Tru1", 2, "White", 3000, 10, true);
		System.out.println(truck1);
		
		Truck truck2 = new Truck("Tru2", 4, "Silver", 1750, 6, false);
		System.out.println(truck2);
		
		
		Garage garage = new Garage();
		
		
		

		
		
	}
}
