package section21_30;


public class FindMinimumElementRotatedSorted {
	
	public static void main(String[] args) {
		System.out.println(findMinRotatedSorted(new int[] {3, 4, 5, 1, 2})); // 3
		System.out.println(findMinRotatedSorted(new int[] {})); // 1

	}
	
	private static int findMinRotatedSorted(int[] arr) {
				
		int n = arr.length;
		int start = 0;
		int end = n-1;  
		
		while( start <= end ) {
			int mid = (start+end)/2;
			
			int next = (mid+1) % n;
			int prev = (mid-1+n) % n;
			
			if(arr[mid] <= arr[prev] && arr[mid] <= arr[next]) {
				return arr[mid];
			} else if(arr[mid]<=arr[end]) {
				end = mid-1;
			} else {
				start = mid+1;
			}
		}
		
		return -1; 
	}

}
