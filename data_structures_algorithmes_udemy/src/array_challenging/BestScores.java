package array_challenging;

import java.util.Arrays;
import java.util.Comparator;

/*
		Given an array, write a function to get first, second best scores from the array.
		
		Array may contain duplicates.
		
		myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
		firstSecond(myArray) // 90 87
		
		*** If there is maximum value duplicated, just skip one of them
		 */

public class BestScores {
	
	public static void main(String[] args) {
		Integer[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
		System.out.println(firstSecond(myArray));
	}
	
	private static String firstSecond(Integer[] myArray) {
		
		var sb = new StringBuilder();
		
		//Arrays.sort(myArray, Comparator.reverseOrder());
		
		Arrays.sort(myArray, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
			
		});
		
		int first = myArray[0];
		int second = 0;
		
		for(int i = 0 ; i < myArray.length ; i++) {
			if(myArray[i] != first) {
				second = myArray[i];
				break;
			}
		}
		
		sb.append(first).append(" ").append(second);
		
		return sb.toString();
	}

}
