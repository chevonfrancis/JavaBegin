package com.qa.array;

public class exerciseArray {
	public static void main(String[] args) {
		
//		hold loop that will hold 10 onterger array
		int[] learnArray = new int[10];
	
//				populate the array value with output
		for(int i = 0; i < learnArray.length; i++) {
			learnArray [0] =12;
			learnArray [1] = 23;
			learnArray [2] = 34;
			learnArray [3] = 45;
			learnArray [4] = 56;
			learnArray [5] = 67;
			learnArray [6] = 78;
			learnArray [7] = 89;
			learnArray [8] = 98;
			learnArray [9] = 87;
			
					
		
				
			System.out.println(learnArray[i]);
			
	}
//		another loop that changes value to time 10 
		for (int i = 0; i < learnArray.length; i++) {
			learnArray[i] = learnArray[i] * 10;  
			System.out.println(learnArray[i]);
		}
	}
}
	
