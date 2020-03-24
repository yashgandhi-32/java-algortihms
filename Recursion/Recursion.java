package l7;

import java.util.Scanner;

public class Recursion {

//	public static String getString(int num) {
//		if (num == 2) {
//			return "abc";
//		} 
//		if (num == 3) {
//			return "def";
//		}
//	}
	
	public static String[] subs(String input) {
		if (input.length() == 0) {
			String output[] = new String[1];
			output[0] = "";
			return output;
		}
		String[] smallOutput = subs(input.substring(1));
		String[] output = new String[smallOutput.length * 2];
		for (int i = 0; i < smallOutput.length; i++) {
			output[i] = smallOutput[i];
		}
		
		for (int i = 0; i < smallOutput.length; i++) {
			output[i + smallOutput.length] = input.charAt(0) + smallOutput[i];
		}
		return output;
	}
	
	public static int towerOfHanoi(int n, char S, char H, char D) {
		if (n == 1) {
			//System.out.println("Move 1st disc from " + S + " to " + D );
			return 1;
		}
		int output = 0;
		output = output + towerOfHanoi(n - 1, S, D, H);
		//System.out.println("Move " + n + "th disc from " + S + " to " + D);
		output++;
		output = output + towerOfHanoi(n - 1, H, S, D);
		return output;
	}
	
	public static boolean isSorted(int a[], int startIndex) {
		if (startIndex == a.length - 1 || startIndex == a.length) {
			return true;
		}
		if (a[startIndex] > a[startIndex + 1]) {
			return false;
		}
		return isSorted(a, startIndex + 1);
	}
	
	public static boolean isSorted(int a[]) {
		if (a.length == 0 || a.length == 1) {
			return true;
		}
		
		if (a[0] > a[1]) {
			return false;
		}
		
		int b[] = new int[a.length - 1];
		for (int i = 1; i < a.length; i++) {
			b[i - 1] = a[i];
		}
		boolean isSmallerSorted = isSorted(b);
		if (isSmallerSorted) {
			return true;
		} else {
			return false;
		}
	}

	public static void printADigit(int d) {
		if (d == 0) {
			System.out.print("Zero ");
		} else if (d == 1) {
			System.out.print("One ");
		} else if (d == 2) {
			System.out.print("Two ");
		} else if (d == 3) {
			System.out.print("Three ");
		} else if (d == 4) {
			System.out.print("Four ");
		} else if (d == 5) {
			System.out.print("Five ");
		} else if (d == 6) {
			System.out.print("Six ");
		} else if (d == 7) {
			System.out.print("Seven ");
		} else if (d == 8) {
			System.out.print("Eight ");
		}  else if (d == 9) {
			System.out.print("Nine ");
		}
	}
	
	public static void printNumToWord(int n) {
		if (n < 10) {
			printADigit(n % 10);
			return;
		}
		printNumToWord(n/10);
		printADigit(n % 10);
	}
	
	public static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		
		return n * fact(n - 1);
	}
	
	public static void main(String[] args) {
		String output[] = subs("abcd");
		System.out.println(towerOfHanoi(10, 'A', 'B', 'C'));
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		//System.out.println(fact(n));
		printNumToWord(n);
	}

}
