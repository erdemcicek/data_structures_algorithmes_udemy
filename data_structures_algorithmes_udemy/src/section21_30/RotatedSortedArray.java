package section21_30;

public class RotatedSortedArray {
	
	public static void main(String[] args) {
		
		// nums = [4,5,6,7,0,1,2], target = 0
		// output 4
		
		// nums = [4,5,6,7,0,1,2], target = 3
		// output -1
		
		// nums = [1], target = 0
		// output -1
		//System.out.println(search(new int[] {1}, 0)); // -1
		///System.out.println(findEdgeIndex(new int[] {4,5,6,7,0,1,2}, 1));
		searching(new int[] {4,5,6,7,0,1,2}, 1);
		
	}
	
	private static int searchMyself(int[] nums, int target) {
		
		int s = 0;
		int e = nums.length-1;
		
		while(s<=e) {
			int mid = s + (e-s)/2; // 		4,5,6,7,0
			if(nums[mid-1] < nums[mid] && nums[mid] > nums[mid+1]) {
				return mid;
			}
			
			if(nums[mid] == target) {
				
			} else if(nums[mid] < target) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		
		return -1;
	}
	
	private static int findEdgeIndex(int[] nums, int target) {
		
		int left = 0;
		int right = nums.length-1;
		
		// 4,5,6,7,0,1,2
		while(left<right) {
			int mid = left + (right-left)/2;
			if(nums[mid] > nums[right]) {
				left = mid+1;
			} else {
				right = mid;
			}
		}
		
		return left;
	}
	
	private static int searching(int[] arr, int key) {
		
		int left = 0;
		int right = arr.length-1;
		int pointer = 0;
		
		// 4,5,6,7,0,1,2
		
		while(left<right) {
			int mid = (left+right)/2;
			System.out.println("mid " + mid);
			
			if(arr[mid-1]>arr[mid] && arr[mid+1]>arr[mid]) {
				System.out.println("iff");
				pointer = mid;
			} else if(arr[right]>arr[mid]) {
				System.out.println("elseif 1");
				right = mid-1;
			} else if(arr[left]<arr[mid]) {
				System.out.println("elseif 2");
				left = mid+1;
			}
		}
		System.out.println(pointer);
		left = 0;
		right = arr.length-1;
		return -1;
	}
	
	
	
	private static int search(int[] arr, int key) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = (start+end)/2;					//  [6,7,0,1,2,3,4], target = 0  a[s] = 6 , a[mid] = 1 		else
														//  [4,5,6,7,0,1,2], target = 0  a[s] = 4 , a[mid] = 7		if
			
			if(arr[mid] == key) {
				return mid;
			}
			
			if(arr[start] <= arr[mid]) {
				if(key >= arr[start] && key <= arr[mid]) {
					end = mid-1;
				} else {
					start = mid+1;
				}
			} else { 							// (nums[s] > nums[mid])
				if(key >= arr[mid] && key <= arr[end]) {
					start = mid+1;
				} else {
					end = mid-1;
				}
			}
		}
		
		return -1;
	}
	
	private static int searchNickSolution(int[] nums, int target) {
		
		if(nums == null || nums.length==0) return -1;
		
		int left = 0;
		int right = nums.length-1;
		
		while(left<right) {
			int mid = left + (right-left)/2;
			if(nums[mid] > nums[right]) {
				left = mid+1;
			} else {
				right = mid;
			}
		}
		
		int start = left;
		left = 0;
		right = nums.length-1;
		
		if(target >= nums[start] && target <= nums[right]) {
			left = start;
		} else {
			right = start;
		}
		
		while(left <= right) {
			int mid = left + (right-left)/2;
			if(nums[mid] == target) {
				return mid;
			} else if(nums[mid] < target) {
				left = mid+1;
			} else {
				right = mid-1;
			}
		}
		
		
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
