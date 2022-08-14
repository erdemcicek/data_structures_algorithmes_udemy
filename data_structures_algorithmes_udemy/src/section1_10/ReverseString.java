package section1_10;

import java.util.Stack;

public class ReverseString {
	
	public static void main(String[] args) {
		
		//reverseStringWithStack(new char[] {'e', 'r', 'd', 'e', 'm'});
		reverseStringViaSwaping(new char[] {'e', 'r', 'd', 'e', 'm'});

	}
	
	private static void reverseStringViaSwaping(char[] s) {
		int start = 0, end = s.length-1;
		while(start<end) {
			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			start++;
			end--;
		}
		System.out.println(String.valueOf(s));
		
	}
	
	private static void reverseStringWithStack(char[] s) {
		Stack<Character> st = new Stack<>();
		for(char ch: s) {
			st.push(ch);
		}
		
		for(int i = 0 ; i < s.length ; i++) {
			s[i] = st.lastElement();
			st.pop();
		}
		String str = String.valueOf(s);
		System.out.println(str);
	}

}
