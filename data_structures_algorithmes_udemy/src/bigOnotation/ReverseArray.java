package bigOnotation;

import java.util.Arrays;

public class ReverseArray {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(reverseArr(new int[] {4, 2, 5, 7, 8})));

	}
	
	private static int[] reverseArr(int[] arr) {
		int len = arr.length;
		for(int i = 0 ; i < len/2 ; i++) {
			if(arr[i] == arr[len-1-i]) continue;
			swap(arr, i, len-1-i);
		}
		
		return arr;
	}
	
	private static void swap(int[] arr, int first, int last) {
		int temp = arr[first];
		arr[first] = arr[last];
		arr[last] = temp;
	}

}
