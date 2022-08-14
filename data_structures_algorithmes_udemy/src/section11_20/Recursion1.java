package section11_20;

public class Recursion1 {
	
	public static void main(String[] args) {
		//printNumber(4);
		//System.out.println(numberOfDigit(4));
		//System.out.println(sumOfDigits(1985));
		//System.out.println(multiply(5, 2));
		//System.out.println(countZeroes(1030002)); // 2
		System.out.println(geometricSum(3)); // 1 + 0.5 + 0.25 + 0.125
	}
	
	private static double geometricSum(int n) {
		if(n==0) return 1;
		//if(n==1) return 1/n;
		return geometricSum(n-1) + Math.pow(2, -n) ;
	}
	
	private static int countZeroes(int n) {
		if(n == 0) return 1;
		if(n<10) return 0;
		return countZeroes(n/10) + countZeroes(n%10);
	}
	
	private static int multiply(int m, int n) { 
		if(n < 0 || m < 0) return -1; // invalid 
		if(n == 0) return 0;
		//if(n == 1) return m;
		return m+multiply(m, n-1);
	}
	
	private static void printNumber(int n) {
		if(n<0) {
			System.out.println("Invalid input. Please enter a positive number");
			return;
		}
		
		if(n == 0) return;
		
		System.out.println(n);
		printNumber(n-1);
		//System.out.println(n);
	}
	
	private static int numberOfDigit(int n) {
		int x = Math.abs(n);
		if(x<10) return 1;
		return numberOfDigit(x/10) + 1;
	}
	
	private static int sumOfDigits(int n) {
		if(n<0) return -1; // invalid
		if(n<10) return n;
		return n%10 + sumOfDigits(n/10);
	}
	

}
