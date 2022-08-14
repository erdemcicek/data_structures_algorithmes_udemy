package section1_10;

public class LengthOfLastWord {
	
	public static void main(String[] args) {
		
		System.out.println(lengthOfLastWord("Hello World"));
		System.out.println(len("Hello World"));
	}
	
	private static int len(String s) {
		String str = s.trim();
		String[] a = str.split(" ");
		String r = a[a.length-1];
		return r.length();
	}
	
	private static int lengthOfLastWord(String s) {
		int count = 0;
		int len = s.length();
		int i = 0;
		
		while(i<len) {
			if(s.charAt(i) != ' ') {
				count++;
				i++;
			} else { 
				// current char is a space
				while(i<len && s.charAt(i) == ' ') i++;
				
				if(i == len) { // end of string
					return count; 
				}
				else {
					count = 0;
				}
			}
		}
		
		return count;
	}

}
