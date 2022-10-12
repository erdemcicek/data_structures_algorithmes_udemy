package section71_80;

class Change {

	Change(long coin2, long bill5, long bill10){
		this.coin2 = coin2;
		this.bill5 = bill5;
		this.bill10 = bill10;
	}
	
    long coin2 = 0;
    long bill5 = 0;
    long bill10 = 0;
    
    public String toString() {
    	return new StringBuilder("coin2 : ")
    			.append(coin2)
    			.append(" , bill5 : ")
    			.append(bill5)
    			.append(" , bill10 : ")
    			.append(bill10)
    			.toString();
    }
}

public class TestJumper {
	
	public static void main(String[] args) {
		System.out.println(computeJoinPoint(471, 480));
		//System.out.println(findDigitSum(181));
//		optimalChange(26);
//		optimalChange(29);
//		optimalChange(17);
//		optimalChange(87);
		
//		System.out.println(optimalChange(41)); // 3, 0, 3
//		System.out.println(optimalChange(35));  // null
//		System.out.println(optimalChange(3));  // null
//		System.out.println(optimalChange(5));  // null
//		System.out.println(optimalChange(0));  // null


	}
	
	static Change optimalChange(long s) { // 22
		long s_in = s;
		
		long[] count = new long[3]; // 2, 5, 10
		
		if(s == 1 || s == 3) return null;
		
		// 1, 3
		if(s % 10 == 1 || s % 10 == 3) { // bi oncesinde dur
			long temp = s - (s%10) - 10;
			// 11 -> 5 2 2 2
			// 13 -> 5 2 2 2 2
			findRest(temp, count);
			count[1]++;
			count[0] = s % 10 == 1 ? count[0] + 3 : count[0] + 4;
		} else {
			findRest(s, count);
		}
		
		long totalExpected = count[0] * 2 + count[1] * 5 + count[2] * 10;
		
		//System.out.println(Arrays.toString(count));
		
	    return s_in == totalExpected ? new Change(count[0], count[1], count[2]) : null;
	}

	private static void findRest(long s, long[] coinCount) {
		coinCount[2] = s / 10;
		s = s % 10; // 2, 4, 5, 6, 7, 8, 9
		if(s == 5 || s == 7 || s == 9) {
			coinCount[1] = 1;
			s = s - 5;
			coinCount[0] = s / 2;
		} else { // 2,4,6,8
			coinCount[1] = 0;
			coinCount[0] = s / 2;
		}
	}
	
	
	
	
	

	
	

//	class Solution {
//	    
//	    // Do not modify this method​​​​​​‌​​‌‌‌​​‌​​​‌​​​‌‌​‌​‌​​‌ signature
//	    static Change optimalChange(long s) {
//	        return null;
//	    }
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int computeJoinPoint(int s1, int s2) {
		
//		while(s1 + findDigitSum(s1) != s2 + findDigitSum(s2)) {
//			
//			s1 = s1 + findDigitSum(s1);
//			s2 = s2 + findDigitSum(s2);
//			if(s1 + findDigitSum(s1) == s2 + findDigitSum(s2)) return s1 + findDigitSum(s1);
//		}
		
		while(true) {
			if(s1 == s2) return s1;
			int s1new = s1 + findDigitSum(s1);
			int s2new = s2 + findDigitSum(s2);
			//if(s1new == s2new) return s1new;
			s1 = s1new;
			s2 = s2new;
		}
		
	}
	
	static int findDigitSum(int n) {
		
		int sum = 0;
		while(n!=0) {
			sum += n%10;
			n /= 10;
		}
		
		return sum;
	}
	
	

}


	











interface ITabChecker {
    public int getWidth();
    public int getHeight();
    public boolean isCheckedCell(final int x, final int y);
}

class TabChecker implements ITabChecker{
	
	int width;
	int height;
	boolean[][] grid;
	
	@Override
	public int getWidth() {
		return width;
	}
	@Override
	public int getHeight() {
		return height;
	}
	@Override
	public boolean isCheckedCell(int x, int y) {
		return grid[x][y];
	}
	
	public int findMaxHeight(final int x, final int y) {
		for(int i = 0 ; i < x ; i++) {
			for(int j = 0 ; j < y ; j++) {
				if(isCheckedCell(x,y)){
					return height - x;
				}
			}
		}
		
		return 0;
	}
	
}