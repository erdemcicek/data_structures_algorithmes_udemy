package array_challenging;

import java.util.Arrays;

/*
  	Write a function called middle that takes a list and returns a new list that contains all but the first and last elements.

	myArray = [1, 2, 3, 4]
	middle(myArray)  # [2,3]
 */

public class MiddleFunction {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(extractMiddle(new int[] {1, 2, 3, 4})));
	}
	
	private static int[] extractMiddle(int[] arr) {
		
		int[] brr = new int[arr.length-2];
		
		for(int i = 0 ; i < brr.length ; i++) {
			brr[i] = arr[i+1];
		}
		
		return brr;
	}
	
	private static int[] middle(int[] arr) {
	    return Arrays.copyOfRange(arr, 1, arr.length-1); 
	}

}
