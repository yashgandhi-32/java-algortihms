package l15;

import java.util.ArrayList;

import l4.ArrayUse;

public class Problems {

	public static void print(int a[], int b[], int sa, int sb,
			ArrayList<Integer> outputSoFar, int lastElementArray) {
		if (lastElementArray == 1 && sb == b.length) {
			
		}
		
		if (lastElementArray == 2 && sa == a.length) {
			
		}
		
		if (lastElementArray == 0 && sa == a.length && sb == b.length) {
			
		}
		
	}
	
	public static int maxSum(int a[], int startIndex) {
		if (startIndex == a.length) {
			return 0;
		}
		
		if (startIndex == a.length - 1) {
			return Math.max(0, a[startIndex]);
		}
		
		int option1 = maxSum(a, startIndex + 1);
		int option2 = maxSum(a, startIndex + 2) + a[startIndex];
		return Math.max(option1, option2);
	}
	
	public static void main(String[] args) {
		int a[] = ArrayUse.takeInput();
		System.out.println(maxSum(a, 0));
	}

}
