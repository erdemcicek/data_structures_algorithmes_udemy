package array_interview;

import java.util.Arrays;

public class AreTwoArrayPermutation {
	
	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {5,1,2,3,4};
		System.out.println(arePermutation(array1, array2)); // true
	}
	
	private static boolean arePermutation(int[] a, int[] b) {
		
		if(a.length != b.length) return false;
		
		int sum1 = Arrays.stream(a).sum();
		int sum2 = Arrays.stream(b).sum();
		
		int prod1 = Arrays.stream(a).reduce(1, (x,y) -> x*y);
		int prod2 = Arrays.stream(b).reduce(1, (x,y) -> x*y);
		
		if(sum1 == sum2 && prod1 == prod2) return true; 
		
		return false;
	}

}
