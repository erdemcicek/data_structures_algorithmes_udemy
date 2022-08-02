package array_interview;

import java.util.Arrays;

public class MaxProduct {
	
	public static void main(String[] args) {
		System.out.println(findMaxProd(new int[] {-100, 3, 5, -200, 30, 22, 60}));
		System.out.println(findMaxProd(new int[] {10,20,30,40,50}));
	}
	
	private static String findMaxProd(int[] arr) {
		
		var sb = new StringBuilder("(");
		Arrays.sort(arr);
		int len = arr.length;
		if(arr[0] < 0 && arr[1] < 0) {
			int negProd = arr[0] * arr[1];
			int posProd = arr[len-2] * arr[len-1];
			int greaterProd = Math.max(negProd, posProd);
			if(greaterProd == negProd) {
				sb.append(arr[0]).append(",").append(arr[1]).append(")");
			} else {
				sb.append(arr[len-2]).append(",").append(arr[len-1]).append(")"); 
			}
		} else {
			sb.append(arr[len-2]).append(",").append(arr[len-1]).append(")");
		}
		
		return sb.toString();
	}

}
