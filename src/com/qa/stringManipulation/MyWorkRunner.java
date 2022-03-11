package com.qa.stringManipulation;

public class MyWorkRunner {
			
			public static void main(String[] args) {
				
				String yestString = "yesterday it was raining";
				String todString = "today it is sunny";
				int count = 0;
				int i;
				int j;
				
				String fourthString = yestString.concat(",  ").concat(todString);
				System.out.println(fourthString.toUpperCase());
				
				System.out.println();
				
				System.out.println(fourthString.substring(27, 44));
				
				System.out.println();
				
				System.out.println("String: " + fourthString);
				
				System.out.println();
				
				for (int i1 = 0; i1 < fourthString.length(); i1++) {
					if (Character.isLetter(fourthString.charAt(i1)))
						count ++;
				}
				System.out.println("Letter: " + count);
				
				System.out.println();
				
				 for (i = 0; i <= fourthString.length() - 1; i++){
			            if (fourthString.substring(i).startsWith(" ") || i == 0){

			  //here I search for the start of the sentence or " "
			      for (j = i + 1; j <= fourthString.length() - 1; j++){

			    if (fourthString.substring(j).startsWith(" ") || j == fourthString.length() - 1) {
			   
			    	//here I search for the next " " or the end of the sentence
			     System.out.println(fourthString.substring(i, j));
			    //printing
			      i = j;
			     //i=j because the next search must be done from where we left

  }
 }
				
			 }
			            }
}
}
