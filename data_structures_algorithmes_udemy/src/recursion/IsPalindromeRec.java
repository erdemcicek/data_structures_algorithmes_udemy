package recursion;

public class IsPalindromeRec {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("ed"));
		System.out.println(isPalIter("ed"));
	}
	
	private static boolean isPalindrome(String s) {
		
		if(s.length() == 0 || s.length() == 1)
            return true; 
		
        if(s.charAt(0) == s.charAt(s.length()-1))
        	return isPalindrome(s.substring(1, s.length()-1));
        
        return false;
	}
	
	private static boolean isPalIter(String s) {
		for(int i = 0 ; i < s.length() / 2 ; i++) {
			if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
		}
		return true;
	}

}
