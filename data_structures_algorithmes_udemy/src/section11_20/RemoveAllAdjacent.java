package section11_20;

import java.util.Stack;

public class RemoveAllAdjacent {
	
	public static void main(String[] args) {
//		Missiissippi  --> M
//		System.out.println(removeDuplicates("Mississippi"));
//		System.out.println(removeDuplicates("abbaca"));
//		System.out.println(removeDupWithoutStack("abbaca"));
		System.out.println(anotherWithoutStack("abbaca"));

		
	}
	
	// Without Stack
	private static String removeDupWithoutStack(String s) {
		StringBuilder sb = new StringBuilder() ;
        
        for(char c:s.toCharArray()){ // abbaca
            if(sb.length()>0 && sb.charAt(sb.length()-1)==c){
                sb.deleteCharAt(sb.length()-1) ;
            }else{
                sb.append(c) ;
            }
        }
        return sb.toString() ;
	}
	
	private static String anotherWithoutStack(String s) {
		
		int stptr = -1;
		char[] a = s.toCharArray();
		for(int i = 0 ; i < a.length ; i++) {
			if(stptr == -1 || a[i] != a[stptr]) {
				stptr++;
				a[stptr] = a[i];
			} else {
				stptr--;
			}
		}
		
		var sb = new StringBuilder();
		for(int i = 0 ; i <= stptr ; i++) {
			sb.append(a[i]);
		}
		
		return sb.toString();
	}
	
	// With Stack
	private static String removeDuplicates(String s) {
		Stack<Character> st = new Stack<>();
		
		int index = 0;
		
		while(index < s.length()) {
			
			if(st.isEmpty() || s.charAt(index) != st.lastElement()) {
				st.push(s.charAt(index));
			} else {
				st.pop();
			}
			
			index++;
		}
		if(st.size()==1) return String.valueOf(st.lastElement());
		var sb = new StringBuilder();
		st.forEach(t -> sb.append(t));
		
		return sb.toString();
	}

}
