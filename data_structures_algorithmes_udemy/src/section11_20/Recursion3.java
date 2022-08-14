package section11_20;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Recursion3 {
	
	public static void main(String[] args) {
		//printAllSubsequences("abc", "");
//		List<String> list = new ArrayList<>();
//		saveAllSubsequences("abc", "", list);
//		System.out.println(list);
//		System.out.println(convertStringtoInteger("123".toCharArray(), 3));
//		printPermutation("", 0);
		//permute("aabc".toCharArray());
		System.out.println(countWay(3));
	}
	
	private static int countWay(int n) {
		if(n < 0) {
			return 0;
		}
		if(n == 0 || n == 1) {
			return 1;
		}
		
		return countWay(n-1) + countWay(n-2) + countWay(n-3);
	}
	
	// Permutation Advanced (including repeating chars)  ----------------------------------------
	
	private static void permute(char input[]) {
		Map<Character, Integer> countMap = new TreeMap<>();  // a: 2, b: 1, c: 1
		for(char ch: input) {
			countMap.compute(ch, (key, val) -> val == null ? 1 : val + 1);
		}
		char str[] = new char[countMap.size()]; // a,b,c
		int count[] = new int[countMap.size()]; // 2,1,1
		int index = 0;
		
		for(Map.Entry<Character, Integer> entry: countMap.entrySet()) {
			str[index] = entry.getKey();
			count[index] = entry.getValue();
			index++;
		}
		char result[] = new char[input.length];
		permuteUtil(str, count, result, 0);
		
	}
	
	
	private static void permuteUtil(char[] str, int[] count, char[] result, int level) {
		if( level == result.length ) {
			printArray(result);
			return;
		}
		
		for(int i = 0 ; i < str.length ; i++) {
			if(count[i] == 0) {
				continue;
			}
			result[level] = str[i];
			count[i]--;
			permuteUtil(str, count, result, level+1);
			count[i]++;
		}
	}

	private static void printArray(char[] result) {
		for(char ch: result) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	// ----------------------------------------------------------------------

	private static void printPermutation(String str, int index) {
		if( index == str.length() ) {
			System.out.println(str);
			return;
		} 
		Map<Integer, Integer> m = new TreeMap<>();
		m.compute(Integer.valueOf(index), (k,v)->{
			return 1;
		});
		
		for(int i = index ; i < str.length() ; i++) {
			str = swap(str,index,i); 
			//System.out.println("str " + str + "   left " + left + " right " + right);
			printPermutation(str, index+1); 
		    //str = swap(str,index,i); 
		}
		
	}
	
	private static String swap(String str, int i, int j) {
		char temp; 
        char[] charArray = str.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
	}
	
	
	private static int convertStringtoInteger(char[] a, int n) { // n is length
		if(n==0) return 0;
		
		int lastDigit = a[n-1] - '0'; 
		
		return lastDigit + 10 * convertStringtoInteger(a, n-1);
	}
	
	private static void saveAllSubsequences(String input, String output, List<String> list){
		if(input.length() == 0) {
			list.add(output);
			return;
		} 
		saveAllSubsequences(input.substring(1), output + input.charAt(0), list); 
		saveAllSubsequences(input.substring(1), output, list);
		
	}
	
	private static void printAllSubsequences(String input, String output) {
		if(input.length() == 0) {
			System.out.println(output);
			return;
		}
		printAllSubsequences(input.substring(1), output + input.charAt(0)); // bc, a  // c, ab  // "", abc

		printAllSubsequences(input.substring(1), output);					// bc, "", // c, "", "", "", ""				
		//printAllSubsequences(input.substring(1), output + input.charAt(0));
		
	}

}
