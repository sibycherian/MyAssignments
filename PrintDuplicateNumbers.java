package week3.day4;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumbers {
	public static void main(String[] args) {
		
//		 Problem Statement : Print only duplicate values
//		 Expected output: 4 and 8
		
		int[] data = {4,3,6,8,29,1,2,4,7,8};

//		 Using Set
		Set<Integer> unq = new TreeSet<>();
		Set<Integer> dup = new TreeSet<>();

//		 Regular for loop
		for (int i = 0; i < data.length; i++) {
//			 Using Set 
//			 Add every element into Set
			if(unq.add(data[i])) {
				unq.add(data[i]);
			}else { 
//				 If it is already there in the Set -> Print duplicate
				dup.add(data[i]);
			}
		}
		System.out.println("Duplicate values are :"+dup);

	}
}
