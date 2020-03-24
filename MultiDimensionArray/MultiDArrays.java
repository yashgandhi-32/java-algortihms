package MultiDimensionArray;

import java.util.Scanner;

public class MultiDArrays {

	public static int[][] takeInput() {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		
		int a[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = s.nextInt();
			}
		}
		return a;
	}
	
	public static void print2DArray(int arr[][]) {
		int m = arr.length;
		for (int i = 0; i < m; i++) {
			int n = arr[i].length;
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int arr[][] = takeInput();
		System.out.println(arr);
		int numRows = arr.length;
		
		for (int i = 0; i < numRows; i++) {
			System.out.println(arr[i]);
		}
		
		print2DArray(arr);
	}

}
