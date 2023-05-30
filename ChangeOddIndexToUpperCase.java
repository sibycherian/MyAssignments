package week2.day1;

import java.util.Iterator;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
	
		//Declare string
		String test="changeme";
				
		//convert string to character array for iteration
		char[] charArray=test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			
			if (i%2==1) { //find odd index & print the value
				//System.out.println("Value at odd index :" +charArray[i]);
				Character c=charArray[i];	
				
				//change odd index to uppercase
				if (Character.isLowerCase(c)) {
					System.out.print(Character.toUpperCase(c));
				}
				}
				else {
					System.out.print(charArray[i]);
				}
		}

		/*for (int i = 0; i < charArray.length; i++) {
			if(i%2==1) {
				char c= Character.toUpperCase(charArray[i]);
				System.out.print(c);
			}
			else {
				System.out.print(charArray[i]);
			}
			
		} */
	}

}