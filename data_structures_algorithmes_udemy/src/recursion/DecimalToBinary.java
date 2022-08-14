package recursion;

public class DecimalToBinary {
	
	public static void main(String[] args) {
//		System.out.println(convertIter(7));
//		System.out.println(convertRec(7));
		toBinary(8);
	}
	
	private static int decimalToBinary(int n){
        // To store the binary number
        int binaryNumber = 0;
        int count = 0;
        while (n != 0) {
            int rem = n % 2;
            double c = Math.pow(10, count);
            binaryNumber += rem * c;
            n /= 2;
  
            // Count used to store exponent length
            count++;
        }
  
        return binaryNumber;
    }
	
	private static int convertRec(int n) {
		if(n == 0 ) return 0;
		return (n % 2) + 10 * convertRec(n / 2);
	}
	
	private static int convertIter(int n) { // 7 ==> 111  1 + 2 + 4
		int digit = n % 2; // 1
		var sb = new StringBuilder();
		while(n>0) {
			n /= 2;
			sb.append(digit); 
			digit = n % 2; 
		}
		return Integer.valueOf(sb.reverse().toString());
	}
	
	private static void toBinary(int decimal) {
		int[] binary = new int[40];
		int index = 0;
		
		while(decimal > 0) {
			binary[index++] = decimal % 2;
			decimal /= 2;
		}
		
		for(int i = index - 1; i >= 0 ; i--) {
			System.out.print(binary[i]);
		}
		
	}
	

}
