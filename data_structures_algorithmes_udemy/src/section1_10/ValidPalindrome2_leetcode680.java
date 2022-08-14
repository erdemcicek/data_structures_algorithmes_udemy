package section1_10;

public class ValidPalindrome2_leetcode680 {
	
	public static void main(String[] args) {
		// abcd			abad		abba		abca
//		System.out.println(validPalindrome("abad"));
//		System.out.println(validPalindrome("abcd"));
//		System.out.println(validPalindrome("abba"));
		System.out.println(validPalindrome("aba"));
	}
	// Very Fast Solution
	private static boolean validPalindrome(String s) {
        boolean del = false;
        int l = 0;
        int r = s.length()-1;
        boolean ans = isPalindrome(s,l,r,del);
        return ans;
    }
	
    private static boolean isPalindrome(String s,int l ,int r, boolean del){
        while(l<=r){
            if( s.charAt(l) == (s.charAt(r))){
                l++;
                r--;
            }
            else if(!del){
                del = true;
                return isPalindrome(s,l+1,r,del) || isPalindrome(s,l,r-1,del);
            }
            else{
                return false;
            }
        }
        return true;
    }
	
	// --------------------------------------------------
	
	// My Solution
	private static boolean validPalindromeMyself(String s) {
		
		if(helper(s)) return true;
		int start = 0, end = s.length()-1;
		
		while(start < end && s.charAt(start) == s.charAt(end)) {
			start++; // 1
			end--;   // 2
		}
		String first = s.substring(start, end);
		String second = s.substring(start+1, end+1);


		return helper(first) || helper(second);
	}
	// My Solution helper
	private static boolean helper(String s) {
		for(int i = 0 ; i <= s.length()/2 ; i++) {
			if(s.charAt(i) != s.charAt(s.length()-1-i)) {
				return false;
			}
		}
		return true;
	}

}
