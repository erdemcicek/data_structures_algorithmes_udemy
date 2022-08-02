package singlylinkedlist;

import java.util.TreeMap;

public class Test {
	
	public static void main(String[] args) {
		int board[][] = {{2,1,0,0,2},
						 {3,2,2,2,1},
						 {1,2,1,2,3},
						 {3,2,3,2,2},
						 {1,2,1,2,1},
						 {1,2,2,2,1},
						 {2,3,3,2,2}};
		System.out.println(identifyShips(board));
		// 2:2 3:1 5:1
	}
	
	static TreeMap<Integer, Integer> identifyShips(int[][] board) {
		int m = board.length;
		int n = board[0].length;
		boolean[] isVisited = new boolean[m*n]; // 35 length
		TreeMap<Integer, Integer> map = new TreeMap<>();
		int len = 0;
		int index = 0;
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(board[i][j] != 3) {
					continue;
				} else {
					int size = getSizeRegion(board, i, j);
				}
				index++;
			}
		}
		return null;
	}
	
	static int getSizeRegion(int[][] board, int row, int col) {
		if(row == 0) {
			
		}
		return 0;
	}
	
	
	static boolean isVisited(int row, int col) {
		return false;
	}




}
