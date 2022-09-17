package section71_80;

public class MinDistance {
	
	// recursive solution
	private static int minDistanceRec(String s1, String s2) { return minD(s1, s1.length(), s2, s2.length()); }
	
	private static int minD(String s1, int m, String s2, int n) {
		if(m == 0) return n;
		if(n == 0) return m;
		if(s1.charAt(m-1) == s2.charAt(n-1)) {
			return minD(s1,m-1,s2,n-1);
		}
		
		int insert = minD(s1,m,s2,n-1);
		int delete = minD(s1,m-1,s2,n-1);
		int replace = minD(s1,m-1,s2,n-1);
		return 1 + Math.min(insert, Math.min(delete, replace) );
	}
	
	// dp solution
	private static int minDistance(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		int[][] dp = new int[m][n];
		
		for(int i = 0 ; i <= m ; i++) {
			for(int j = 0 ; j <= n ; j++) {
				if(i == 0) {
					dp[i][j] = j;
				} else if(j == 0) {
					dp[i][j] = i;
				} else if(s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1];
				} else {
					int insert = dp[i][j-1];
					int delete = dp[i-1][j];
					int replace = dp[i-1][j-1];
					dp[i][j] = 1 + Math.min(insert, Math.min(delete, replace));
				}
			}
		}
		return dp[m][n];
	}

}
