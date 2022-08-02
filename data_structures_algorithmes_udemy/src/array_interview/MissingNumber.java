package array_interview;

import java.util.Arrays;

public class MissingNumber {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 10};
		System.out.println(findMissingNumber2(arr));
	}
	
	private static int findMissingNumber2(int[] arr) {
		
		int len = arr.length;
		int totalIter = ((arr[0] + arr[len-1]) / 2) * (len+2);
		
		int total = Arrays.stream(arr).sum();
		
		
		return totalIter - total;
	}
	
	private static int findMissingNumber(int[] arr) {
		
		int f = arr[0];
		
		for(int i = 1 ; i < arr.length ; i++) {
			if(f+1 != arr[i]) return arr[i]-1;
			f++;
		}
		
		return 0;
	}

}
