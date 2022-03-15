package com.qa.scanner;

import java.util.Scanner;

public class Menu {
	
	
		public void start() {
		
		ScannerCalculator c = new ScannerCalculator();
		
		Scanner sumUp = new Scanner(System.in);
		
		
		boolean running = true;
		
		while (running) {
		

		System.out.println("Would you like to use multiplication? (y/n)");
		String choice = sumUp.nextLine();
		if (choice.equalsIgnoreCase("y")) {
			
			System.out.println("Print a number: ");
		Integer numberOne = sumUp.nextInt();
		sumUp.nextLine(); 
		
		System.out.println("Print another number : ");
		Integer numberTwo = sumUp.nextInt();
		System.out.print("Sum: ");
		System.out.println(c.mul(numberOne, numberTwo));
		sumUp.nextLine(); 
		
			continue;
		}
		else if (choice.equalsIgnoreCase("n")) {
			System.out.println("Would you like to use division? (y/n)");
			String choice1 = sumUp.nextLine();
			if (choice1.equalsIgnoreCase("y")) {
				
				System.out.println("Print a number: ");
			Integer numberOne = sumUp.nextInt();
			sumUp.nextLine(); 
			
			System.out.println("Print another number : ");
			Integer numberTwo = sumUp.nextInt();
			System.out.print("Sum: ");
			System.out.println(c.div1(numberOne, numberTwo));
			sumUp.nextLine(); 
			
			continue;
			}
			else if (choice.equalsIgnoreCase("n")) {
				System.out.println("Would you like to use addition? (y/n)");
				String choice2 = sumUp.nextLine();
				if (choice2.equalsIgnoreCase("y")) {
					
					System.out.println("Print a number: ");
				Integer numberOne = sumUp.nextInt();
				sumUp.nextLine(); 
				
				System.out.println("Print another number : ");
				Integer numberTwo = sumUp.nextInt();
				System.out.print("Sum: ");
				System.out.println(c.add(numberOne, numberTwo));
				sumUp.nextLine(); 
				continue;
				}
				else if (choice.equalsIgnoreCase("n")) {
					System.out.println("Would you like to use subtraction? (y/n)");
					String choice3 = sumUp.nextLine();
					if (choice3.equalsIgnoreCase("y")) {
						
						System.out.println("Print a number: ");
					Integer numberOne = sumUp.nextInt();
					sumUp.nextLine(); 
					
					System.out.println("Print another number : ");
					Integer numberTwo = sumUp.nextInt();
					System.out.print("Sum: ");
					System.out.println(c.sub(numberOne, numberTwo));
					sumUp.nextLine(); 
			running = false;
			break;
		}else {
			System.out.println("Invalid Value, Restarting");
			
			sumUp.close();
			
		
		}
			}
		}
		
		}
		
		 }
		

	
	}
	}


