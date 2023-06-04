package week3.day3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
		//Declare An Array for {3,2,11,4,6,7}
		int[] a={3,2,11,4,6,7};
		//Declare another Array for {1,2,8,4,9,7};
		int[] b={1,2,8,4,9,7};
		
		int arraysizea = a.length;
		int arraysizeb = b.length;
		
		//create a two empty Lists - list1 & list2
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		//Declare for loop iterator from 0 to array a.length and add into list1
		for (int i = 0; i < arraysizea; i++) {	
			list1.add(a[i]);
		}
		//System.out.println(list1);
		int size1 = list1.size();
		//System.out.println(size1);
		
		//Declare for loop iterator from 0 to array b.length and add into another list2
		for (int j = 0; j < arraysizeb; j++) {
			list2.add(b[j]);
		}
		//System.out.println(list2);
		int size2 = list2.size();
		//System.out.println(size2);
		
		//Compare Both list1 & list2 using a nested for loop
		for (int i = 0; i < size1; i++) {
			for (int j = 0; j < size2; j++) {
				if (list1.get(i)==list2.get(j)) {
					//Print the matching number - //2,4,7
					System.out.println("Matching number :"+list1.get(i)); 
					//System.out.println("list2:"+list2.get(j)+" "+j);
				}
				
			}
		}
	}

}
