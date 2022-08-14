package others;

import java.util.TreeMap;

public class AerialReconnaissance {
	
	public static void main(String[] args) {
		
		int[][] aerial = {
							{2,1,0,0,2},
							{3,2,2,2,1},
							{1,2,1,2,3},
							{3,2,3,2,2},
							{1,2,1,2,1},
							{1,2,2,2,1},
							{2,3,3,2,2}
						 };
		
		System.out.println(findNumberOfEnemyShip(aerial));
		// 2:2, 3:1, 5:1
	}
	
	
	private static class CustomObject{
		int length;
		boolean contains3;
	}
	
	private static TreeMap<Integer, Integer> findNumberOfEnemyShip(int[][] aerial){
		
		int m = aerial.length;
		int n = aerial[0].length;
		boolean[][] isVisited = new boolean[m][n];
		
		TreeMap<Integer, Integer> treeMap = new TreeMap<>();
		CustomObject custom = new CustomObject();
		
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(aerial[i][j] != 2 && !isVisited[i][j]) {
					custom.length = 0;
					custom.contains3 = false;
					search(aerial, i, j, isVisited, custom);
					if(custom.contains3) {
						treeMap.compute(custom.length, (key ,val) -> val == null ? 1 : val + 1 );
					}
				} 
			}
		}
		
		return treeMap;
	}

	private static void search(int[][] aerial, int i, int j, boolean[][] isVisited, CustomObject custom ) {
		if( i < 0 || j < 0 || i >= aerial.length || j >= aerial[0].length) {
			return;
		}
		
		if( aerial[i][j] == 2) {
			return;
		}
		
		if(isVisited[i][j]) {
			return;
		}
		
		isVisited[i][j] = true;
		custom.length++;
		if( aerial[i][j] == 3) {
			custom.contains3 = true;
		}
		search(aerial, i-1, j  , isVisited, custom);
		search(aerial, i  , j-1, isVisited, custom);
		search(aerial, i  , j+1, isVisited, custom);
		search(aerial, i+1, j  , isVisited, custom);
	}

}

//if(!treeMap.containsKey(custom.length)) {
//treeMap.put(custom.length, 1);
//} else {
//treeMap.put(custom.length, treeMap.get(custom.length) + 1);
//}
