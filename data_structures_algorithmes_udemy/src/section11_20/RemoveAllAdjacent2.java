package section11_20;

import java.util.Stack;

public class RemoveAllAdjacent2 {
	
	public static void main(String[] args) {
		System.out.println(removeDuplicates("deeedbbcccbdaa", 3)); //aa
		System.out.println(removeDuplicates("abcd", 2)); //abcd
		
	}
	
	private static class Pair{
		char letter;
		int count;
		
		public Pair(char letter, int count) {
			this.letter = letter;
			this.count = count;
		}
		
		public String toString() {
			return String.valueOf(letter) + ":" + String.valueOf(count);
		}
	}
	
	private static String removeDuplicates(String s, int k) {
		Stack<Pair> st = new Stack<>();
		int index = 0;
		char[] a = s.toCharArray();
		while( index < s.length() ) {
			
			if(st.isEmpty() || a[index] != st.lastElement().letter) {
				st.push(new Pair(a[index], 1));
			} else if(a[index] == st.lastElement().letter) {
				st.lastElement().count++;
			}
			if(st.lastElement().count == k) {
				st.pop();
			}
			
			index++;
		}
		
		//System.out.println(st);
		var sb = new StringBuilder();
		for(Pair p: st) {
			for(int i = 0 ; i < p.count ; i++) {
				sb.append(p.letter);
			}
		}
		
		return sb.toString();
	}

}
