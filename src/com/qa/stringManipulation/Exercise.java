package com.qa.stringManipulation;

import java.util.Arrays;

public class Exercise {
	

	public String[] simpMethodOne(String xput) {
		String word = xput.strip();
		Sring[] words = word.split(" ");
		return words;
		}
	
	public void methodOne(String xput) {
		int words = 0;
		String input = xput.strip();
		
		for (int i = 0; i < input.length(); i++){
			if (input.substring(i, i + 1).startsWith(" ") || i == (input.length() - 1)) {
				System.out.println(input.supstring(i, space));
				space = 1; 
			}
			
		)
		}
	}
	
	}


