package recursion;

public class PowerOfNumber {
	
	public static void main(String[] args) {
		System.out.println(findPowerIter(2, 3));
		System.out.println(findPowerRec(2, 3));
	}
	
	private static int findPowerIter(int num, int pow) {
		if(pow < 0) return -1;
		int prod = 1;
		while(pow > 0) {
			prod *= num;
			pow--;
		}
		return prod;
	}
	
	private static int findPowerRec(int num, int pow) {
		if(pow < 0) return -1;
		if(pow == 0) return 1;
		return num * findPowerRec(num, pow-1);
	}

}
