package com.qa.array;

public class Runner {
	public static void main(String[] args) {
		
////		blank array 
//		int[] numArray;
//		
////		array with already has data set 
//		int[] anotherArray = {10, 15, 24, 69};
//		
////		array that specified length of index positions but do not know what is in it 
//		int[] finalArray = new int[5];
//	
////		making a multi-dimensional array = an array of arrays
//		int[][] mdArray;
//
//		
////		how to assign values in an array 
////		finalArray[0] = 10;
////		finalArray[1] = 20;
////		finalArray[2] = 30;
////		finalArray[3] = 40;
////		finalArray[4] = 50;
//		
//		for(int i = 0; i < finalArray.length; i++) {
//			finalArray[i] = 20;
//		}
//		
////		i++ = i incrementing by 1 until the loop ends at 5 for this loop
////		for(int i = 0; i < 5; i++) {
//////			another way to write the above (int i = 0; i < finalArray.length; i++)
////			System.out.println(finalArray[i]);	
//	}
////		this is a for each loop
//		for (int number : finalArray) {
//			System.out.println(number);
//		}
//		
		
//		example of multipD arrays
		int [][] anotherMdArray = {{2, 1, 4}, {3, 5, 8}, {2, 8, 4}};
		
		for (int i = 0; i < anotherMdArray.length; i++) {
			for (int j = 0; j < anotherMdArray[i].length; j++) {
				System.out.println(anotherMdArray[i][j] + " ");
			}
//			this allowa a space between each multiD array
			System.out.println();
		}
	}
}
