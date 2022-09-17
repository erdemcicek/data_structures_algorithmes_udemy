package section21_30;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInString {
	
	public static void main(String[] args) {
		String str = "sky   is blue"; // blue is sky
		String response = reverseWords(str);
		System.out.println(response);
	}
	
	private static String reverseWords(String s) {
		
		String res = Arrays.stream(s.split(" ")).filter(t->t.length()>0).map(t->new StringBuilder(t).reverse().toString()).collect(Collectors.joining(" "));
		
		return new StringBuilder(res).reverse().toString();
	}

}
