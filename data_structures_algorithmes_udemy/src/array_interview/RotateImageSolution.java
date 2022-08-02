package array_interview;

import java.util.Arrays;

public class RotateImageSolution {
	
	public static void main(String[] args) {
		int[][] matrix = {  {1, 2, 3},   
							{4, 5, 6},   
							{7, 8, 9} };
		rotateMatrixSolution(matrix);
	}
	
	private static void prettyPrint(int[][] matrix) {
		for(int i = 0 ; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
	
	 private static void rotateMatrixSolution(int[][] matrix) {
		    if (matrix.length == 0 || matrix.length != matrix[0].length) return;
		    int len = matrix.length; // 3
		 // it iterates only for layer=0
		    for (int layer = 0; layer < len/2; layer++) {
		      int first = layer;          // 0
		      int last = len - 1 - layer; // 2
		      // it iterates for i=0, i=1
		      for (int i=first; i<last; i++) {
		        int offset = i - first; // 0
		        int top = matrix[first][i]; // 1
		        matrix[first][i] = matrix[last-offset][first];         // 0,0 ==> 2,0
		        matrix[last-offset][first] = matrix[last][last-offset];// 2,0 ==> 2,2
		        matrix[last][last-offset] = matrix[i][last];           // 2,2 ==> 0,2
		        matrix[i][last] = top;								   // 0,2 ==> 0,0

		      }

		    }
		    prettyPrint(matrix);

		  }

}
