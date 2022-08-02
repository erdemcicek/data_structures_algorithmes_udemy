package recursion;

public class GreaterCommonDivisor {
	
	public static void main(String[] args) {
		//System.out.println(findGCDIter(6, 36));
		System.out.println(findGCDRec(20, 44));
	}
	
	private static int findGCDIter(int num1, int num2) {
		if(num1 < 0 || num2 < 0) return -1;
		int gcd = 1;
		for(int i = 1 ; i <= Math.min(num1, num2) ; i++) {
			if(num1 % i == 0 && num2 % i == 0) gcd = i;
		}
		return gcd;
	}
	
	private static int findGCDRec(int num1, int num2) {
		if(num1 < 0 || num2 < 0) return -1;
		if(num2 == 0) return num1;
		return findGCDRec(num2, num1 % num2);
	}

}
