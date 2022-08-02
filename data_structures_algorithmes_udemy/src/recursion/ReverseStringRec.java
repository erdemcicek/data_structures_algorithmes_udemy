package recursion;

public class ReverseStringRec {
	
	public static void main(String[] args) {
		System.out.println(reverse("erdem"));
	}
	
	private static String reverse(String str) {
		if(str.isEmpty()) {
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}

}
