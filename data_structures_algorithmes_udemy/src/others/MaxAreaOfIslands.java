package others;

import java.util.concurrent.atomic.AtomicInteger;

public class MaxAreaOfIslands {
	
	public static void main(String[] args) {
		
		int[][] grid = {					// expected : 6
		        {0,0,1,0,0,0,0,1,0,0,0,0,0},
		        {0,0,0,0,0,0,0,1,1,1,0,0,0},
		        {0,1,1,0,1,0,0,0,0,0,0,0,0},
		        {0,1,0,0,1,1,0,0,1,0,1,0,0},
		        {0,1,0,0,1,1,0,0,1,1,1,0,0},
		        {0,0,0,0,0,0,0,0,0,0,1,0,0},
		        {0,0,0,0,0,0,0,1,1,1,0,0,0},
		        {0,0,0,0,0,0,0,1,1,0,0,0,0}
		};
		/*
		Input: grid = [[0,0,0,0,0,0,0,0]]
		Output: 0
		*/
		
		System.out.println(maxAreaOfIsland(grid));
	}
	
	private static class MyInteger{
		int value;
	}
	
	private static int maxAreaOfIsland(int[][] grid) {
		
		int m = grid.length;
		int n = grid[0].length;
		boolean[][] isVisited = new boolean[m][n];
		MyInteger myInteger = new MyInteger();
		int maxArea = 0;
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if( grid[i][j] == 1 && isVisited[i][j] == false) {
					myInteger.value = 0;
					dfs(grid, i, j, isVisited, myInteger);
					maxArea = Math.max(maxArea, myInteger.value);
					
				}
			}
		}
		
		return maxArea;
	}

	private static void dfs(int[][] grid, int i, int j, boolean[][] isVisited, MyInteger myInteger) {
		if( i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
			return;
		}
		
		if(grid[i][j] == 0) {
			return;
		}
		
		if(isVisited[i][j] == true) {
			return;
		}
		
		isVisited[i][j] = true;
		myInteger.value++;
		dfs(grid, i-1, j  , isVisited, myInteger);
		dfs(grid, i  , j-1, isVisited, myInteger);
		dfs(grid, i  , j+1, isVisited, myInteger);
		dfs(grid, i+1, j  , isVisited, myInteger);
	}

}
