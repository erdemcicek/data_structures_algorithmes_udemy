package array_challenging;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
		Write a function to find all pairs of an integer array whose sum is equal to a given number.
		
		Example
		
		pairSum({2, 4, 3, 5, 6, -2, 4, 7, 8, 9},7)
		Output : "2:5 4:3 3:4 -2:9 "
 */

public class Pairs {
	
	public static void main(String[] args) {
		int[] arr = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
		System.out.println(findPairs(arr, 7));
	}
	
	private static String findPairs(int[] a, int sum) {
		var sb = new StringBuilder();
		
		List<Integer[]> list = new ArrayList<>();
		
		for(int i = 0 ; i < a.length-1 ; i++) {
			for(int j = i+1; j < a.length ; j++) {
				if(a[i] + a[j] == sum) {
					list.add(new Integer[] {a[i], a[j]});
				}
			}
		}
		
		for(int i = 0 ; i<list.size() ; i++) {
			sb.append(list.get(i)[0]).append(":").append(list.get(i)[1]).append(" ");
		}
		
//		String s = list.stream().flatMap(Arrays::stream).map(String::valueOf).collect(Collectors.joining(":"));

		return sb.toString().substring(0, sb.length()-1);
	}

}
