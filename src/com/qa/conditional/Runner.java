package com.qa.conditional;

public class Runner {
	
	public static void main(String[] args) {
		
		boolean flag = false;
		
		if (flag) {
			System.out.println("The flag is true");
		} else {
			System.out.println("The flag is false");
		} else {
			System.out.println("Neither are true");
		}
	}
	}

	int num = 3; 
	int num2 = 6;
//	 this is an and statement && this is and or statement ||
	if (num == 3 && num == 6) {
		System.out.println("conditions met");
	}else {
		System.out.println("conditions not met");
	
	}

}

// switch case 
		switch(num) {
		case 1:
			System.out.println("Number is 1");
//			when checks the case and it matches, the break will stop it from automating the other cases
			break;
		case 2:
			System.out.println("Number is 2");
			break;
		case 3:
			System.out.println("Number is 3");
			break;
		default:
			System.out.println("Number is something else");
			
		}