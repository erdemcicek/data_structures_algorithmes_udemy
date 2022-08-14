package others;

public class NumberOfIsland {
	
	public static void main(String[] args) {
		
		char[][] grid1 = {
							 {'1', '1', '1', '1', '0'},
							 {'1', '1', '0', '1', '0'},
							 {'1', '1', '0', '0', '0'},
							 {'0', '0', '0', '0', '0'}
						 };
		
		char[][] grid2 = {
							 {'1', '1', '0', '0', '0'},
							 {'1', '1', '0', '0', '0'},
							 {'0', '0', '1', '0', '0'},
							 {'0', '0', '0', '1', '1'},
						 };
		
		System.out.println(findNumberIsland(grid1));
		System.out.println(findNumberIsland(grid2));

	}
	
	private static int findNumberIsland(char[][] grid) {
		
		int m = grid.length;
		int n = grid[0].length;
		boolean[][] isVisited = new boolean[m][n];
		
		int count = 0;
		
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(grid[i][j] == '1' && isVisited[i][j] == false) {
					dfs(grid, i, j, isVisited);
					count++;
				}
			}
		}
				
				
		return count;
	}

	private static void dfs(char[][] grid, int i, int j, boolean[][] isVisited) {
		
		if( i<0 || j<0 || i >= grid.length || j >= grid[0].length) {
			return;
		}
		
		if( grid[i][j] == '0') {
			return;
		}
		
		if(isVisited[i][j] == true) {
			return;
		}
		
		isVisited[i][j] = true;
	
		dfs(grid, i-1, j  , isVisited);
		dfs(grid, i  , j-1, isVisited);
		dfs(grid, i  , j+1, isVisited);
		dfs(grid, i+1, j  , isVisited);
		
	}

}
