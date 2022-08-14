package section21_30;

import java.util.Arrays;

/*
	Input: nums = [5,7,7,8,8,10], target = 8	Input: nums = [5,7,7,8,8,10], target = 6	Input: nums = [], target = 0
	Output: [3,4]								Output: [-1,-1]								Output: [-1,-1]
 */

public class FindFirstAndLastOcc {
	
	public static void main(String[] args) {
		//System.out.println(Arrays.toString(searchRange(new int[] {7,7}, 7)));
		System.out.println(Arrays.toString(searchRange(new int[] {5,7,7,8,8,10}, 8))); // 0,0

	}
	
// 	----------------------------  %100 speed, %48 memory usage

	private static int[] searchRangeMyself(int[] nums, int target) {
		int[] ans = {-1,-1};
		
		if(nums.length == 0) return ans;
		if(nums.length == 1) {
			if (nums[0] == target) {
				ans[0] = 0;
				ans[1] = 0;
			}
			return ans;
		}
		int s = 0, e = nums.length-1;
		
		while(s<=e) {
			int mid = (e + s)/2;
			if(nums[mid] == target) {
				return pointer(nums, target, mid);
			} else if(nums[mid] < target) {
				s = mid+1;
			} else {
				e = mid-1;
			}
		}
		
		return ans;
	}
	
	private static int[] pointer(int[] nums, int target, int mid) {
		int i = mid;
		while(i >= 0 && nums[i] == target) {
			i--;
		}
		int j = mid;
		while(j < nums.length && nums[j] == target) {
			j++;
		}
		return new int[] {i+1,j-1};
	}
	
	
	
	// ----------------------------  %100 speed, %94 memory usage
	
	private static int getIndex(int[] nums, int target, boolean getFirst) {
		int s = 0;
		int e = nums.length - 1;
		int ans = -1;
		
		while(s<=e) {
			int mid = s + (e-s)/2;
			
			if(nums[mid] == target) {
				ans = mid;
				if(getFirst) {
					e = mid-1;
				} else {
					s = mid+1;
				}
				
			} else if(nums[mid] < target) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		return ans;
	}
	/*
	private static int getLast(int[] nums, int target) {
		int s = 0;
		int e = nums.length - 1;
		int ans = -1;
		
		while(s<=e) {
			int mid = s + (e-s)/2;
			
			if(nums[mid] == target) {
				ans = mid;
				s = mid+1;
			} else if(nums[mid] < target) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		return ans;
	} */
	
	private static int[] searchRange(int[] nums, int target) {
		int[] ans = {-1,-1};
		int first = getIndex(nums, target, true);
		if(first == -1) {
			return ans;
		}
		
		int last = getIndex(nums, target, false);
		ans[0] = first;
		ans[1] = last;
		return ans;
	}
	
	
	
	
	
	
	
	
	
	
	

}
