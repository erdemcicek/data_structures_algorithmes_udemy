package section71_80;


public class TrieNode {

	boolean isTerminal;
	TrieNode[] child = new TrieNode[26];
	
	TrieNode() {
//		isTerminal = false;
//		for(int i = 0 ; i < 26 ; i++) {
//			child[i] = null;
//		}
	}
	
	public static void main(String[] args) {
		String[] dict = {"ARE",
						 "AS",
						 "DO",
						 "DOT",
						 "NEW",
						 "NEWS",
						 "NO",
						 "NOT"};
		
		TrieNode root = new TrieNode();
		for(int i = 0 ; i < dict.length ; i++) {
			add(dict[i], root);
		}
		
//		System.out.println(search("ARE", root));
//		System.out.println(search("NO", root));
//		System.out.println(search("NEWS", root));
//		System.out.println(search("AREE", root));

	}
	
	static void add(String word, TrieNode trie) {
		int n = word.length();
		for(int i = 0 ; i < n ; i++) {
			if(trie.child[word.charAt(i) - 'A'] == null) {
				trie.child[word.charAt(i) - 'A'] = new TrieNode();
			}
			trie = trie.child[word.charAt(i) - 'A'];
		}
		trie.isTerminal = true;
	}
	
	static boolean search(String word, TrieNode trie) {
		int n = word.length();
		for(int i = 0 ; i < n ; i++) {
			if(trie.child[word.charAt(i) - 'A'] == null) {
				return false;
			}
			trie = trie.child[word.charAt(i) - 'A'];
		}
		return trie.isTerminal;
	}
	
	/*
			 Input: grid = [
		  ["1","1","1","1","0"],
		  ["1","1","0","1","0"],
		  ["1","1","0","0","0"],
		  ["0","0","0","0","0"]
	 */
	
	private static class CustomObject{
		int length;
	}
	
	
	static int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        boolean[][] isVisited = new boolean[m][n];
        
        int count = 0;
        
        CustomObject custom = new CustomObject();
        
        for(int i = 0 ; i < m ; i++) {
        	for(int j = 0 ; j < n ; j++) {
        		if(grid[i][j] == '1' && !isVisited[i][j]) {
        			dfs(i, j, grid, isVisited, custom);
        		}
        	}
        }
        
        return count;
       
    }
	
	static void dfs(int x, int y, char grid[][], boolean isVisited[][], CustomObject custom) {
		
		if(x < 0 || y < 0 || x > grid.length || y > grid[0].length) {
			return;
		}
		
		if(grid[x][y] == '0') {
			return;
		}
		
		if(isVisited[x][y]) {
			return;
		}
		
		isVisited[x][y] = true;
		
		
		dfs(x-1,y  ,grid,isVisited,custom);
		dfs(x+1,y  ,grid,isVisited,custom);
		dfs(x  ,y-1,grid,isVisited,custom);
		dfs(x  ,y+1,grid,isVisited,custom);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
