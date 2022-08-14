package section11_20;

import java.util.Arrays;

public class Recursion2 {
	
	public static void main(String[] args) {
		System.out.println(isSorted2(new int[] {1,2,3,4,5}, 5));
	}
	
	private static boolean isSorted1(int[] a, int n) {
		if(n == 0 || n == 1) return true;
		if(a[n-1] < a[n-2]) return false;
		
		return isSorted1(a, n-1);
	}
	
	private static boolean isSorted2(int[] a, int n) {
		if(n == 0 || n == 1) return true;
		if(a.length == 2 && a[0] > a[1]) return false;
		return isSorted2(Arrays.copyOfRange(a, 1, n), n-1);
	}

}
