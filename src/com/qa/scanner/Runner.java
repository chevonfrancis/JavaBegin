package com.qa.scanner;

import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {
		
		try (Scanner scanMe = new Scanner(System.in)) {
			boolean flag = true;
			
			while (flag) {
			
			System.out.println("Print a number : ");
			Integer numberOne = scanMe.nextInt();
			
//		consumes the leftover newline character
			scanMe.nextLine(); 
			
			System.out.println("Print another number : ");
			Integer numberTwo = scanMe.nextInt();
			
			System.out.print("Sum: ");
			System.out.println(numberOne + numberTwo);
			
			System.out.println("First Value: " + numberOne);
			System.out.println("Second Value: " + numberTwo);
			scanMe.nextLine(); 
			
			System.out.println("Would you like to continue? (y/n)");
			String choice = scanMe.nextLine();
			
			if (choice.equalsIgnoreCase("y")) {
				continue;
			}else if (choice.equalsIgnoreCase("n")) {
				System.out.println("Closing now..");
				flag = false;
				continue;
			}else {
				System.out.println("Invalid Value, Restarting");
			}

}
		}
	}
}
