package section41_50;

import java.util.Stack;

public class ValidParantheses {

	private boolean isValid(String s) {
		
		Stack<Character> st = new Stack<>();
		
		for(int i = 0; i < s.length() ; i++) {
			char curr = s.charAt(i);
			if(curr == '(' || curr == '{' || curr == '[') {
				st.push(curr);
			} else {
				
				if(st.isEmpty()) {
					return false;
				} else if(curr == ')') {
					if(st.peek() == '(')
						st.pop();
					else
						return false;
				} else if(curr == '}') {
					if(st.peek() == '{')
						st.pop();
					else
						return false;
				} else if(curr == ']') {
					if(st.peek() == '[')
						st.pop();
					else
						return false;
				}
			}
			
		}
		
		return st.isEmpty();
	}
}
