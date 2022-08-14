package section21_30;

import java.util.concurrent.Future;

public class FindMinimumElementRotatedSorted {
	
	public static void main(String[] args) {
		System.out.println(findMinRotatedSorted(new int[] {3, 4, 5, 1, 2})); // 3
		System.out.println(findMinRotatedSorted(new int[] {})); // 1

	}
	
	private static int findMinRotatedSorted(int[] a) {
		
		Future<Integer> f = null;
		
		int n = a.length;
		int s = 0;
		int e = n-1;  
		
		while( s <= e ) {
			int mid = (s+e)/2;
			
			int next = (mid+1) % n;
			int prev = (mid-1+n) % n;
			
			if(a[mid] <= a[prev] && a[mid] <= a[next]) {
				return a[mid];
			} else if(a[mid]<=a[e]) {
				e = mid-1;
			} else {
				s = mid+1;
			}
		}
		
		return -1; 
	}

}
