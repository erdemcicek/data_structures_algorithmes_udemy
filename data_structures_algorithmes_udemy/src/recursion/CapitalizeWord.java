package recursion;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeWord {
	
	public static void main(String[] args) {
		System.out.println(capitalize("i love java"));
		//System.out.println(capitalizeWord("i love java"));
	}
	
	private static String capitalizeWord(String s) {
		
		if(s.isEmpty()) 
			return s;
		
		char chr = s.charAt(s.length()-1);
		
		if(s.length() == 1) 
			return Character.toString(Character.toUpperCase(chr));
		
		if(s.substring(s.length()-2, s.length()-1).equals(" ")) 
			chr = Character.toUpperCase(chr);
		
		return capitalizeWord(s.substring(0, s.length()-1)) + Character.toString(chr);
	}
	
	private static String capitalize(String s) {
		
		String[] arr = s.split(" ");
		
		for(int i = 0 ; i<arr.length ; i++) {
			if(arr[i].length()==1) 
				arr[i] = arr[i].toUpperCase();
			else {
				char upp = Character.toUpperCase(arr[i].charAt(0));
				arr[i] = String.valueOf(upp) + arr[i].substring(1);
			}
		}
		
		return Arrays.stream(arr).collect(Collectors.joining(" "));
		
	}

}
