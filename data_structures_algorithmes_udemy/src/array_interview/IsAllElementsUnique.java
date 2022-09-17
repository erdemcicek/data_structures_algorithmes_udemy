package array_interview;

import java.util.HashSet;
import java.util.Set;

public class IsAllElementsUnique {
	
	public static void main(String[] args) {
		
		int[] a = {1, 3, 4, 5};
		int[] b = {1, 1, 2, 3};
		System.out.println(isUnique(a));
		System.out.println(isUnique(b));
	}
	
	private static boolean isUnique(int[] arr) {
		
		Set<Integer> set = new HashSet<>();
		for(int i = 0 ; i < arr.length ; i++) {
			if(!set.add(arr[i])) return false;
		}
		
		return true;
	}

}
