package section71_80;

public class MinStep {
	
	public static void main(String[] args) {
		System.out.println(minStepRec(95));
		System.out.println(minStepMemo(95));
		System.out.println(minStepDP(95));
	}
	
	// Recursive
	private static int minStepRec(int n) {
		
		if(n <= 1) return 0;
		
		int x = minStepRec(n-1);
		int y = Integer.MAX_VALUE;
		int z = Integer.MAX_VALUE;
		
		if(n % 2 == 0) {
			y = minStepRec(n/2);
		}
		
		if(n % 3 == 0) {
			z = minStepRec(n/3);
		}
		
		
		int ans = Math.min(x, Math.min(y, z)) + 1;
		return ans;
	}
	
	// Memoization ( Top-Down DP )
	private static int minStepMemo(int n) {
		int[] ans = new int[n+1];
		
		for(int i = 0 ; i < ans.length ; i++) {
			ans[i] = -1;
		}
		return helper(n, ans);
	}

	private static int helper(int n, int[] ans) {
		
		// base case
		if(n <= 1) {
			return 0;
		}
		
		// check if output already exist
		if(ans[n] != -1) {
			return ans[n];
		}
		
		// recursive
		int x = helper(n-1,ans);
		int y = Integer.MAX_VALUE;
		int z = Integer.MAX_VALUE;
		
		if(n % 2 == 0) {
			y = helper(n/2, ans);
		}
		
		if(n % 3 == 0) {
			z = helper(n/3, ans);
		}
		
		// calculate ans
		int output = Math.min(x, Math.min(y, z)) + 1;
		
		// save for future use
		ans[n] = output;
		
		return output;
	}
	
	// Bottom-Up
	private static int minStepDP(int n) {
		
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 0;
		
		// dp[i] = min steps needed to move
		// from i->1, ans = dp[n]
		
		for(int i = 2 ; i <= n ; i++) {
			/*
			int x = dp[i-1];
			int y = Integer.MAX_VALUE;
			int z = Integer.MAX_VALUE;
			
			if(i % 2 == 0) {
				y = dp[i/2];
			}
			if(i % 3 == 0) {
				z = dp[i/3];
			}
			dp[i] = 1 + Math.min(x, Math.min(y, z));
			*/
			
			dp[i] = 1 + dp[i-1];
			
			if(i % 2 == 0) {
				dp[i] = 1 + Math.min(dp[i], dp[i/2]);
			}
			if(i % 3 == 0) {
				dp[i] = 1 + Math.min(dp[i], dp[i/3]);
			}
			
		}
		
		return dp[n];
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
