package week3.day4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacterHW {

	public static void main(String[] args) {
	
	/*Take your name as input
	 Print all unique characters only (any order)
	 Input:  Siby 
	 Output: S i b y */
		
		String name = "Siby";
		//Convert String to Character array
		char[] ch = name.toCharArray();
		//Create a new Set -> HashSet
		Set<Character> unq = new HashSet<>();
		
		for (Character i : ch) {
			//Add each character to the Set and if it is already there, remove it
			if(unq.add(i)){ 
			}
		}
		
		//Finally, print the set
		System.out.println(unq);

	}

}
