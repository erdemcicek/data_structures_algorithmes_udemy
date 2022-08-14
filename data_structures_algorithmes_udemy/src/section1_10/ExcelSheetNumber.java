package section1_10;

public class ExcelSheetNumber {
	
	public static void main(String[] args) {
		System.out.println(findExcelSheetNumber("A"));
		
	}
	
	private static int findExcelSheetNumber(String s) {
		int ans = 0;
		int len = s.length();
		int pow = 1;
		
		for(int i = len-1 ; i >= 0 ; i--) {
			ans = ans + (s.charAt(i) - 64) * pow;
			pow = pow * 26;
		}
		return  ans;
	}

}
