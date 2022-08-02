package recursion;

import java.util.stream.IntStream;

public class Fibonacci {
	
	// f(n) = f(n-1) + f(n-2)  ---> flow
	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
	public static void main(String[] args) { 
//		String result = IntStream
//							.rangeClosed(1, 6)
//							.mapToObj(t -> String.valueOf(fibonacci(t)))
//							.collect(Collectors.joining(","));
//		System.out.println(result);
//		IntStream.rangeClosed(1, 6).forEach(t -> System.out.print(t == 6 ? fibonacci(t) : fibonacci(t)+","));
		System.out.println(fibonacci(3));

	}
	
	private static int fibonacci(int n) {
		if(n < 0) return -1;
		if(n == 0 || n == 1) return n;
		return fibonacci(n-1) + fibonacci(n-2);
	}

}
