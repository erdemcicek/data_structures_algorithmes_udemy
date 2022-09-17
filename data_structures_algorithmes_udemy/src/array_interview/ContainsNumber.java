package array_interview;

public class ContainsNumber {
	
	public static void main(String[] args) {
		System.out.println(findIndex(new int[] {1, 3, 5}, 3));
	}
	
	private static int findIndex(int[] arr, int searched) {
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == searched) return i;
		}
		
		throw new IllegalArgumentException("Value " + searched + " is not found in the given array");
	}

	
	
}
