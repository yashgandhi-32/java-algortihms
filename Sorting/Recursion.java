package Sorting;

public class Recursion {

	public static void printSubs(String input, String outputSoFar) {
		if (input.length() == 0) {
			System.out.println(outputSoFar);
			return;
		}
		printSubs(input.substring(1), outputSoFar);
		printSubs(input.substring(1), outputSoFar + input.charAt(0));
	}
	
	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(50));
		//printSubs("abcd", "");
	}

}
