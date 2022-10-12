package section81_90;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInBinaryMatrix {
	
	public static void main(String[] args) {
		int[][] grid = {{0,0,0}, {1,1,0}, {1,1,0}};
		System.out.println(shortestPathBinaryMatrix(grid));
	}

	private static int shortestPathBinaryMatrix(int[][] grid) {
		
		if(grid[0][0] == 1) return -1;
		
		int[] dx = {-1, 0, 1,-1, 1,-1, 0, 1};
		int[] dy = {-1,-1,-1, 0, 0, 1, 1, 1};
		int n = grid.length;
		
		boolean[][] visited = new boolean[n][n];
		
		Queue<Cell> q = new LinkedList<>();
		q.add(new Cell(0,0,1));
		visited[0][0] = true;
		
		while(!q.isEmpty()) {
			
			Cell temp = q.remove();
			
			if(temp.x == n-1 && temp.y == n-1) {
				return temp.dist;
			}
			for(int i = 0; i < 8 ; i++) {
				int x = temp.x + dx[i];
				int y = temp.y + dy[i];
				if(x>=0 && x<n && y>=0 && y<n && grid[x][y] == 0 && !visited[x][y]) {
					q.add(new Cell(x,y,temp.dist+1));
					visited[x][y] = true;
				}
			}
			
		}
		
		return -1;
	}
	
	private static class Cell{
		int x;
		int y;
		int dist;
		
		Cell(int x, int y, int dist){
			this.x = x;
			this.y = y;
			this.dist = dist;
		}
		
		public String toString() {
			return new StringBuilder("x:").append(x).append(" y:").append(y).append(" dist:").append(dist).toString();
		}
	}
}
