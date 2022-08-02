package array_challenging;

import java.util.Arrays;
import java.util.stream.IntStream;

// Write a function to find the missing number in a given integer array of 1 to n

public class MissingNumber {
	
	public static void main(String[] args) {
		System.out.println(findMissingNumber(new int[] {1, 2, 3, 4, 5, 6, 7}));
	}
	
	private static int findMissingNumber(int[] arr) {
		
		int len = arr.length;
		int sumIteration = IntStream.rangeClosed(1, len+1).sum();
		
		int sumArray = Arrays.stream(arr).sum();
		
		return sumIteration - sumArray;
	}

}
