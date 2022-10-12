package section91_100;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

	private static int orangesRotting(int[][] grid) {
		
		int[] dx = { 0,-1, 1, 0};
		int[] dy = {-1, 0, 0, 1};
		
		int m = grid.length;
		int n = grid[0].length;
		
		boolean[][] visited = new boolean[m][n];
		
		Queue<Cell> q = new LinkedList<>();
		
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(grid[i][j] == 2) {
					q.offer(new Cell(i,j,0));
					visited[i][j] = true;
				}
			}
		}
		
		int time = 0;
		
		while(!q.isEmpty()) {
			Cell temp = q.poll();
			
			time = Math.max(time, temp.time);
			for(int i = 0 ; i < 4 ; i++) {
				int x = temp.x + dx[i];
				int y = temp.y + dy[i];
				if(x>=0 && x<m && y>=0 && y<n && grid[x][y] == 1 && !visited[x][y]) {
					q.offer(new Cell(x,y,temp.time + 1));
					visited[x][y] = true;
					grid[x][y] = 2;
				}
			}
		}
		
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(grid[i][j] == 1) {
					return -1;
				}
			}
		}
		
		return time;
	}
	
	private static class Cell{
		int x;
		int y;
		int time;
		
		Cell(int x, int y, int time){
			this.x = x;
			this.y = y;
			this.time = time;
		}
	}
}
