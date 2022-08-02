package array_interview;

import java.util.Arrays;

// Given an image represented by an NxN matrix write a method to rotate the image by 90 degrees.

/*
 1, 2, 3, 4   
 5, 6, 7, 8
 9, a, b, c
 d, e, f, g 

*/

public class RotateImage {
	
	public static void main(String[] args) {
		int[][] matrix = {  {1, 2, 3},   // { {7, 4, 1}
							{4, 5, 6},   //   {8, 5, 2}
							{7, 8, 9} }; //   {9, 6, 3} }
		
	//	System.out.println(Arrays.deepToString(rotateMatrix(matrix))); 
		///prettyPrint(rotateMatrix(matrix));
		// 0,0 ==>0,2 
		// 0,1 ==>1,2
		// 0,2 ==>2,2
		rotateMatrixSolution(matrix);
		
	}
	


	  private static void rotateMatrixSolution(int[][] matrix) {
	    if (matrix.length == 0 || matrix.length != matrix[0].length) return;
	    int n = matrix.length;
	    for (int layer = 0; layer < n/2; layer++) {
	      int first = layer;
	      int last = n - 1 - layer;
	      for (int i=first; i<last; i++) {
	        int offset = i - first;
	        int top = matrix[first][i];
	        matrix[first][i] = matrix[last-offset][first];
	        matrix[last-offset][first] = matrix[last][last-offset];
	        matrix[last][last-offset] = matrix[i][last];
	        matrix[i][last] = top;

	      }

	    }
	    prettyPrint(matrix);

	  }

	
	private static void prettyPrint(int[][] matrix) {
		for(int i = 0 ; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
	
	private static int[][] rotateMatrix(int[][] matrix){
		int len = matrix.length;
		
//		for(int i = 0 ; i < len ; i++) {
//			for(int j = 0 ; j < len ; j++) {
//				swap(matrix, i,j);
//			}
//		}
		swap(matrix, 0, 0);
		
		return matrix;
	}
	
	private static int[][] swap(int[][] matrix, int x, int y){
		int len = matrix.length;
		int temp = matrix[x][y];
		matrix[x][y] = matrix[y][len-x-1];
		matrix[y][len-x-1] = temp;
		return matrix;
	}

}
