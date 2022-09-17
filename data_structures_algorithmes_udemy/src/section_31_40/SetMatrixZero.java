package section_31_40;

public class SetMatrixZero {
	
	public static void main(String[] args) {
		
	}
	
	private static void setZeroes(int[][] matrix) {
		
		int rowNum = matrix.length;
		if(rowNum == 0) return;
		
		int colNum = matrix[0].length;
		if(colNum == 0) return;
		
		boolean hasZeroFirstRow = false;
		boolean hasZeroFirstCol = false;
		
		// Does first row contain ZERO
		for(int j = 0; j < colNum; j++) {
			if(matrix[0][j] == 0) {
				hasZeroFirstRow = true;
				break;
			}
		}
		
		// Does first col contain ZERO
		for(int i = 0 ; i < rowNum; i++) {
			if(matrix[i][0] == 0) {
				hasZeroFirstCol = true;
				break;
			}
		}
		
		// make use of first row and col
		// find zero and store info in first row and col
		
		for(int i = 1 ; i < rowNum ; i++) {
			for(int j = 1 ; j < colNum ; j++) {
				if(matrix[i][j] == 0) {
					matrix[i][0] = 0; // first col
					matrix[0][j] = 0; // first row
				}
			}
		}
		
		for(int i = 1 ; i < rowNum ; i++) {
			for(int j = 1 ; j < colNum; j++) {
				if(matrix[0][j] == 0 || matrix[i][0] == 0) {
					matrix[i][j] = 0;
				}
			}
		}
		
		// set zeroes for first row
		if(hasZeroFirstRow) {
			for(int j = 0 ; j < colNum ; j++) {
				matrix[0][j] = 0;
			}
		}
		
		// set zeroes for first col
		if(hasZeroFirstCol) {
			for(int i = 0 ; i < rowNum ; i++) {
				matrix[i][0] = 0;
			}
		}
		
		
	}

}
