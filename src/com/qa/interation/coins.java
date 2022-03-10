package com.qa.interation;

public class coins {
	public void calChange (double amount, double total) {
		double change = amount - total;
		int tenpound = 0;
		
		
		while (change >= 20);
		
	}
		
		public static void main(String[] args) {
			double change = 15.66;
			while (change > 0) {
				if (change>= 10.00) {
					System.out.println("Ten Pounds");
					change = 10.00;
					
			
					
				}
				else if (change >= 5.00) {
					System.out.println("Five Pounds");
					change = 5.00;
				
					 
			}
				else if (change >= 00.20) {
					System.out.println("Twenty Pence");
					change = 00.20;
					
					
		}
				else if (change >= 00.02) {
					System.out.println("Two Pence");
					change = 00.02;
					
	}
			}
}
}
