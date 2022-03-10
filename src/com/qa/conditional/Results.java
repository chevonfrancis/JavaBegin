package com.qa.conditional;

public class Results {

	public static void main(String[] args, int x, int y) {
		
		Conditional cd = new Conditional(x = 2, y = 4);
		
		if (x > y)
		System.out.println(cd.div1(x, y) );
	} else {
		System.out.println("Division cannot be performed");
	}
	

}
