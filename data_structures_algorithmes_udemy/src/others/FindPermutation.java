package others;

import java.util.Arrays;
/*
 	n => length of range
 	s => string describing changes
 	D => decreasing
 	I => increasing
 */

public class FindPermutation {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(findPermutation("DDID", 5)));
	}
	
	private static int[] findPermutation(String s, int n) {
		
		int[] ans = new int[n];
		int start = 1, end = n;
		
		for(int i = 0 ; i < s.length() ; i++) {
			if(s.charAt(i) == 'D') {
				ans[i] = end;
				end--;
			} else {
				ans[i] = start;
				start++;
			}
		}
		ans[n-1] = start;
		
		return ans;
	}

}
