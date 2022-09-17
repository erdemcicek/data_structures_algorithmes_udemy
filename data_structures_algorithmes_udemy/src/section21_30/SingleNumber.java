package section21_30;

public class SingleNumber {
	
	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] {4, 1, 2, 2, 1, 4, 5}));
	}
	
	// X-OR approach
	
	private static int singleNumber( int[] nums) {
		int r = 0;
		for(int i = 0 ; i < nums.length ; i++) {
			r = r ^ nums[i] ;
		}
		
		return r;
	}
	

}
