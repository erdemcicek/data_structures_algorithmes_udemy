package array_challenging;

import java.util.Arrays;

/*
 	Write a function to find the duplicate number on given integer array.

	removeDuplicates({1, 1, 2, 2, 3, 4, 5})
	Output : [1, 2, 3, 4, 5]
*/
public class RemoveDuplicates {
	
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 3, 4, 5};
		System.out.println(Arrays.toString(removeDuplicates(arr)));
//		int[] brr = {8, 1, 5, 2, 3, 2, 5};
//		System.out.println(Arrays.toString(removeDuplicates(brr)));
	}
	
	 private static int removeDuplicates(int a[], int n) {// arr, 7
	        if (n == 0 || n == 1) return n;
	        int j = 0;
	        for (int i = 0; i < n - 1; i++) {
	            if (a[i] != a[i + 1]) {
	                a[j++] = a[i];
	            }
	        }
	        a[j++] = a[n - 1];
	        return j;
	  }

	  private static int[] removeDuplicates(int[] arr) {
		//Arrays.sort(arr);
	    int result = removeDuplicates(arr, arr.length);
	    int[] newArray = new int[result];
	    for (int i = 0; i < result; i++) {
	            newArray[i] = arr[i];
	    }
	    return newArray;
	  }

}
