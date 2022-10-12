package section71_80;

public class LongestCommonSubsequence {
	
	public static void main(String[] args) {
		//System.out.println(longestCommonSubsequenceRecursive("apple", "attpe"));
		System.out.println(longestCommonSubsequenceDP("apple", "topale"));
	}
	
	private static int lcs(String s1, int i, String s2, int j) {
		
		if(s1.length()==i || s2.length()==j) {
			return 0;
		}
		
		// case for match
		if(s1.charAt(i) == s2.charAt(j)) {
			return 1 + lcs(s1,i+1,s2,j+1);
		}
		
		// case for mismatch
		int first =  lcs(s1, i  , s2, j+1);
		int second = lcs(s1, i+1, s2, j  );
		return Math.max(first, second);
	}
	
	private static int longestCommonSubsequenceRecursive(String text1, String text2) {
		return lcs(text1,0,text2,0);
	}
	
	private static int longestCommonSubsequenceDP(String text1, String text2) {
		
		int m = text1.length();
		int n = text2.length();
		
		int[][] dp = new int[m+1][n+1];
		
		for(int i = 0 ; i <= m ; i++) {
			for(int j = 0 ; j <= n ; j++) {
				if(i==0 || j==0) {
					dp[i][j] = 0;
				} else if(text1.charAt(i-1) == text2.charAt(j-1)) {
					dp[i][j] = 1 + dp[i-1][j-1];
				} else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		
		return dp[m][n];
	}

}
