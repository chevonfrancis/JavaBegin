package com.qa.operators;

public class Runner {
	
	public static void main(String[] args) {
		
//		Calculator c = new Calculator();
//		System.out.println(c.add(5,9));
//		System.out.println(c.sub(5,9)); 
//		System.out.println(c.mul(5,9));
//		System.out.println(c.div(5,9));
//		System.out.println(c.div1(5,9));
//		 if (c.div2(5 > 9)) {
//			 System.out.println("Division cannot be performed");
		 
		
		Results r = new Results(150, 150, 84);
		r.methodOne();
		r.methodTwo();
		r.methodThree();
		r.methodFour();
		
		ResultsRevisited r = new RshowPercentage (150, 85, 85);
		r.methodFive();
		r.methodSix();
		

		
	}

}
