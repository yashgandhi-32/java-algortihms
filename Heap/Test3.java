package l20;

import java.util.ArrayList;

public class Test3 {
	
	public static void interleavingsHelper(String first, String second, String outputSoFar){
		if (first.length() == 0 && second.length() == 0) {
			System.out.println(outputSoFar);
			return;
		}
		if (first.length() > 0) {
			interleavingsHelper(first.substring(1), second, outputSoFar + first.charAt(0));
		}
		if (second.length() > 0) {
			interleavingsHelper(first, second.substring(1), outputSoFar + second.charAt(0));
		}
		
	}
	
	public static void interleavings(String first, String second){
		interleavingsHelper(first, second, "");
	}
	
	
	public static boolean decFrequency(int a[], int k) {
		for (int i = k; i < 9; i = i + 3) {
			if (a[i] > 0) {
				a[i]--;
				return true;
			}
		}
		return false;
	}
	
	public static ArrayList<Integer> largestMultiple3(ArrayList<Integer> input) {
		int a[] = new int[10];
		int sum = 0;
		for (int element: input) {
			a[element]++;
			sum = sum + element;
		}
		int remainder = sum % 3;
		if (remainder == 1) {
			boolean done = decFrequency(a, 1);
			if (!done) {
				decFrequency(a, 2);
				decFrequency(a, 2);
			}
		} else if (remainder == 2) {
			boolean done = decFrequency(a, 2);
			if (!done) {
				decFrequency(a, 1);
				decFrequency(a, 1);
			}
		}
		ArrayList<Integer> output = new ArrayList<>();
		for (int i = 9; i >= 0; i--) {
			for (int j = 0; j < a[i]; j++) {
				output.add(i);
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		
	}

}
