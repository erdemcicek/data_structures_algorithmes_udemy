package section71_80;

public class UniquePath {
	
	public static void main(String[] args) {
		System.out.println(findUniquePath(3, 7));
	}
	
	private static int findUniquePath(int m, int n) {
		 
		if(m <= 0 || n <= 0) return 0;
		if(m == 1 || n == 1) return 1;
		
		int[][] grid = new int[m][n];
		for(int i = 1 ; i < m ; i++) {
			grid[i][0] = 1;
		}
		for(int i = 1 ; i < n ; i++) {
			grid[0][i] = 1;
		}
		for(int i = 1 ; i < m ; i++) {
			for(int j = 1 ; j < n ; j++) {
				grid[i][j] = grid[i-1][j] + grid[i][j-1];
			}
		}
		
		return grid[m-1][n-1];
	}
	
	private static int helper(int m, int n) {
		
		int ans = 1;
		
		for(int i = n ; i < n+m-2; i++) {
			ans = ans * i;
			ans = ans / (i-n+1);
		}
		
		return ans;
		
	}

}
