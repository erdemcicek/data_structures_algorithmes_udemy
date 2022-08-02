package recursion;

/*
 	When we can easily breakdown a problem into similar subproblem
 	When traverse a tree
 	When we use memoization in recursion
 	
 	
 	Write Recursion in 3 Steps
 	Step 1: Recursive case - the flow
 	Step 2: Base case - the stopping criterion
 	Step 3: Unintentional case - the contstraint
 */

public class Intro {
	
	public static void main(String[] args) {
		System.out.println(factorial(3));
		System.out.println("-----------------------");
		recursiveMethod(3);
		System.out.println(factorialIter(7));
	}
	
	private static int factorial(int n) {
		if(n < 1) return -1;			// unintentional case
		if(n == 0 || n == 1) return 1;  // base case
		return n * factorial(n-1);      // flow
	}
	
	private static int factorialIter(int n) {
		if( n < 0) return -1;
		if (n == 0 || n == 1) return 1;
		int prod = 1;
		while(n>0) {
			prod *= n;
			n--;
		}
		return prod;
	}

	private static void recursiveMethod(int n) {
		if(n < 1) 
			System.out.println("n is less than 1");
		else {
			recursiveMethod(n-1);
			System.out.println(n);
		}
	}
}
