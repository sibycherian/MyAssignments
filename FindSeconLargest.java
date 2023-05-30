package week2.day1;

import java.util.Arrays;

public class FindSeconLargest {

	public static void main(String[] args) {
		
				// Here is the input
				int[] data = {3,2,11,4,6,7};
				int length=data.length;
				 
				// Arrange the array in ascending order
				//2,3,4,6,7,11
				Arrays.sort(data);
				
				//Pick the 2nd element from the last and print it
				//System.out.println(data[data.length-2]);
				System.out.println("Second element from last is :"+data[length-2]);
	}

}
