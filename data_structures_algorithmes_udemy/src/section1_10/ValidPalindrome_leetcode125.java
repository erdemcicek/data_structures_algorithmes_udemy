package section1_10;

public class ValidPalindrome_leetcode125 {
	
	public static void main(String[] args) {
		// A man, a plan, a canal: Panama
		//boolean x = isPalindrome("A man, a plan, a canal: Panama");
		boolean x = isPalindrome(" ");
		System.out.println(x);
	}
	
	private static boolean isPalindrome(String s) {
		
		s = s.toLowerCase();
				
		int start = 0, end = s.length()-1;
		///char first = 'a', last = 'b';
		while( start < end ) {
			
			while( start < end && !Character.isLetterOrDigit(s.charAt(start))) {
				start++;
			}
			//first = convert(s.charAt(start));
			//first = Character.toLowerCase(s.charAt(start));
			
			while( start < end && !Character.isLetterOrDigit(s.charAt(end))) {
				end--;
			}
			//last = convert(s.charAt(end));
			//last = Character.toLowerCase(s.charAt(end));
			
			if(s.charAt(start++) != s.charAt(end--)) return false;
			
			//if(first != last) return false;
			
//			start++;
//			end--;
			
		}
		
		
		return true;
	}
	
	private static char convert(char c) {
		
		if(Character.isUpperCase(c)) {
			return Character.toLowerCase(c);
		}
		return c;
	}

}
