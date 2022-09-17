package section_31_40;

public class Search2DMatrix {
	
	public static void main(String[] args) {
		System.out.println(searchMatrix(new int[][] {{1,3}}, 3));
	}
	
	private static boolean searchMatrix(int[][] matrix, int target) { 
		
		int m = matrix.length;    
		int n = matrix[0].length; 
		if(m == 0 || n == 0) return false;
		
		for(int i = 0 ; i < m ; i++) {
			if(matrix[i][n-1] == target) return true; 
			if(matrix[i][n-1] > target) {
				for(int j = n-1 ; j >= -1 ; j--) {
					if(j == -1) return false;
					if(matrix[i][j] == target) return true;
				}
			}
			
		}
		
		return false;
	}

}
