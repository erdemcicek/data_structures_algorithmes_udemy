package recursion;

/*
   How to find the sum of digits of a positive integer number using recursion ?
 */

public class SumOfDigits {
	
	// 11 ==> 2
	// 26 ==> 8
	public static void main(String[] args) {
		System.out.println(findSumOfDigitsRec(26));
		System.out.println(findSumOfDigitsIter(26));
	}
	private static int findSumOfDigitsIter(int n) {
		int sum = 0, currentDigit;
		while(n>0) {
			currentDigit = n % 10;
			sum += currentDigit;
			n /= 10;
		}
		return sum;
	}
	
	private static int findSumOfDigitsRec(int n) {
		if(n<0) return -1;
		if(n<10) return n;
		
		return (n % 10) + findSumOfDigitsRec(n / 10);
	}

}
