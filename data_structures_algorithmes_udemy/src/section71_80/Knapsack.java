package section71_80;

public class Knapsack {
	
	// Recursive
	
	private static int knapsackSolutionRecursive(int[] prices, int[] weights, int totalWeight) {
		return knapsack(prices.length, totalWeight, prices, weights);
	}

	private static int knapsack(int n, int totalWeight, int[] prices, int[] weights) {
		// n --> number of items
		if(n == 0 || totalWeight == 0) {
			return 0;
		}
		
		if(weights[n-1] > totalWeight) {
			return knapsack(n-1, totalWeight, prices, weights);
		} else {
		//  Assumption : We have one copy of each item 
			int include = prices[n-1] + knapsack(n-1, totalWeight - weights[n-1], prices, weights);
			
		//	If we say there is infinite number of items, we then call recursion without excluding the item picked
		//	So we call recursion with the parameter n instead of (n-1)
		//	int include = prices[n-1] + knapsack(n, totalWeight - weights[n-1], prices, weights);
			
			int exclude = knapsack(n-1, totalWeight, prices, weights);
			return Math.max(include, exclude);
		}
		
	}
	
	public static void main(String[] args) {
		int[] weights =  {6 , 3 , 2 , 15, 5};
		int[] prices =   {30, 12, 12, 24, 5};
		System.out.println(knapsackSolutionDP(prices, weights, 10));
		
	}
	
	
	// Buttom-Up
	
	private static int knapsackSolutionDP(int[] prices, int[] weights, int totalWeight) {
		
		int n = prices.length;
		int[][] dp = new int[n+1][totalWeight+1];
		
		for(int i = 0 ; i <= n ; i++) {
			for(int j = 0 ; j <= totalWeight ; j++) {
				if(i == 0 || j == 0) {
					dp[i][j] = 0;
				} else if( weights[i-1] > j) {
					dp[i][j] = dp[i-1][j];
				} else {
//					If we have one copy of each item
					int include = prices[i-1] + dp[i-1][j - weights[i-1]];
//					If we have infinite number of items we do not decrease i
//					int include = prices[i-1] + dp[i][j - weights[i-1]];
					int exclude = dp[i-1][j];
					dp[i][j] = Math.max(include, exclude);
				}
			}
		}
		
		return dp[n][totalWeight];
	}
	
	

}
