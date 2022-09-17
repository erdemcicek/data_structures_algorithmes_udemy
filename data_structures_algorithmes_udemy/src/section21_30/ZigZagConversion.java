package section21_30;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {
	
	public static void main(String[] args) {
		System.out.println(convert("PAYPALISHIRING", 3)); // PAHNAPLSIIGYIR
														  // PAHNAPLSIIGYIR
		
		System.out.println(convert("AB", 1));
	}
	
	private static String convert(String s, int numRows) {
		if(numRows == 1) return s;
		StringBuilder[] str = new StringBuilder[numRows];
		for(int i = 0 ; i < str.length ; i++) {
			str[i] = new StringBuilder();
		}
		
		int len = s.length();
		int p = 0; // pointer
		int c = 0; // cursor
		boolean isIncreasing = true;
		
		while(p<len) {
			
			str[c].append(s.charAt(p));
			if(isIncreasing) {
				c++;
			} else {
				c--;
			}
			
			p++;
			
			if(c == numRows-1) {
				isIncreasing = false;
			}
			if(c == 0) {
				isIncreasing = true;
			}
			
		}
		var newSb = new StringBuilder();
		for(StringBuilder sb: str) {
			newSb.append(sb);
		}
		
		return newSb.toString();
	}
	

}
