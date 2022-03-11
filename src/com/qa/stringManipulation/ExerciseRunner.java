package com.qa.stringManipulation;

public class ExerciseRunner {
		
		public static void main(String[] args) {
			
			String yestString = "yesterday it was raining";
			String todString = "today it is sunny";
			
			String fourthString = yestString.concat(",  ").concat(todString);
			System.out.println(fourthString.toUpperCase());
			
			System.out.println();
			
			System.out.println(fourthString.substring(27, 44));
			
			System.out.println();
			
			Exercise s = new Exercise();
			
			s.methodOne("yesterday it was raining");
			s.methodTwo();
			s.methodThree();
			s.methodFour();
			
			
			
			
			
			
		}

	}


