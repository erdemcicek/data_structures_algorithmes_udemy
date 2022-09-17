package section_31_40;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		
	}
	
	private static List<Integer> spiralOrder(int[][] matrix){
		
		List<Integer> ans = new ArrayList<>();
		
		int m = matrix.length;
		if(m==0) return ans;
		
		int n = matrix[0].length;
		
		int sr = 0, er = m-1, sc = 0, ec = n-1;
		int count = 0;
		
		while(sr<=er && sc<=ec) {
			
			// print start row (sr)
			for(int i=sc; i<=ec; i++) {
				ans.add(matrix[sr][i]);
				count++;
			}
			sr++;
			if(count == m*n) return ans;
			
			// print end column (ec)
			for(int i=sr; i<=er; i++) {
				ans.add(matrix[i][ec]);
				count++;
			}
			ec--;
			if(count == m*n) return ans;
			
			//print end row (er)
			for(int i=ec; i>=sc; i--) {
				ans.add(matrix[er][i]);
				count++;
			}
			er--;
			if(count == m*n) return ans;
			
			//print start column (sc)
			for(int i=er; i>=sr; i--) {
				ans.add(matrix[i][sc]);
				count++;
			}
			sc++;
			if(count == m*n) return ans;
			
			
		}
		
		return ans;
	}
	
	
	
	
	
	
	
	
	private static List<Integer> spiralMyself(int[][] a){
		
		List<Integer> ans = new ArrayList<>();
		
		int m = a.length;
		if(m==0) return ans;
		int n = a[0].length;
		
		int startRow = 0, endRow = n-1, startCol = 0, endCol = m-1;
		int count = 0;
		
		while(startRow<=endRow && startCol<=endCol) {
			
			//for(int i=startRow; )
		}
		
		return ans;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
