package others;

public class JunctionPoint {
	
	// A B C D 
	//   E C R T 
	public static void main(String[] args) {
		System.out.println(computeJoint(471, 480));
	}
	
	private static int computeJoint(int x, int y) {
		
		while(x != y) {
			
			if(x < y) {
				if(x == 0) return -1;
				x += getDigitsSum(x);
			} else if ( x > y) {
				if(y == 0) return -2;
				y += getDigitsSum(y);
			}
		}
		
		return x;
	}
	
	static int getDigitsSum(int x){
		
	    int sum = 0;
	    while (x != 0)
	    {
	        sum += x % 10;
	        x /= 10;
	    }

	    return sum;
	}

}
