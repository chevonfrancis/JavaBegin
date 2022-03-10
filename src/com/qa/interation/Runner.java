package com.qa.interation;

public class Runner {
	public static void main(String[] args) {
		
//	new Runnable() {
	public void run() {
//			loops for only a certain number of time stated - static
		for (int i = 0; i == 10; i++) {
			System.out.println(i);
	}
}
//			this is while loop is more flexible 
			boolean drum = true;
			int count = 0;
			
//			while flag is true
			while (drum == true) {
				System.out.println("I am drumming");
				count++;
				
				if (count <= 10) {
					drum = false; 
				}
			}
			
			do {
				System.out.println("I am looping again");
				count ++;
					
					if (count <= 10) {
						drum = false; 
					} while(drum);
		}
	}
}

