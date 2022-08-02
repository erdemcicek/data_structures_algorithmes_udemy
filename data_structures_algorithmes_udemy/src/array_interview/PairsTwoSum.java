package array_interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
		Input: nums = [2,7,11,15], target = 9
		Output: [0,1]
		Output: Because nums[0] + nums[1] == 9, we return [0, 1]
		
		Input: nums = [3,2,4], target = 6
		Output: [1,2]
 */

public class PairsTwoSum {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(findPairsWithMap(new int[] {11, 15, 2, 7}, 9))); // 1, 3
	}
	
	private static int[] findPairsWithMap(int[] nums, int target) {
		
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
	    int[] res = new int[2];
	    for (int i = 0; i < nums.length; ++i) {
	        m.put(nums[i], i);
	    }
	    for (int i = 0; i < nums.length; ++i) {
	        int t = target - nums[i];
	        if (m.containsKey(t) && m.get(t) != i) {
	            res[0] = i;
	            res[1] = m.get(t);
	            break;
	        }
	    }
	    return res;
	}
	
	private static int[] findPairsNestedLoop(int[] arr, int target) {
		
		for(int i = 0 ; i < arr.length-1 ; i++) {
			for(int j = i+1 ; j < arr.length; j++ ) {
				if(arr[i] + arr[j] == target) return new int[] {i,j};
			}
		}

		
		return null;
	}

}
