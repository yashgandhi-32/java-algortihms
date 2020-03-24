package Sorting;

public class MergeSort {
	
		
	public static int[] merge(int[] input, int begin, int mid, int end) {
		int[] output = new int[end - begin + 1];
		int i = begin;
		int j = mid + 1;
		int k =0;
		while (i <= mid && j <= end) {
			if (input[i] < input[j]) {
				output[k] = input[i];
				i++;
				k++;
			} else {
				output[k] = input[j];
				k++;
				j++;
			}
		}
		
		while (i <= mid) {
			output[k] = input[i];
			i++;
			k++;
		}
		
		while (j <= end) {
			output[k] = input[j];
			k++;
			j++;
		}
		return output;
	}

	public static void mergeSort (int[] input, int beginIndex, int endIndex) {
		if (beginIndex >= endIndex) {
			return;
		}
		
		int mid = (beginIndex + endIndex)/2;
		mergeSort(input, beginIndex, mid);
		mergeSort(input, mid + 1, endIndex);
		
		int[] temp = merge(input, beginIndex, mid, endIndex);
		
		for (int i =0; i < temp.length; i++) {
			input[i + beginIndex] = temp[i];
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int n = 10; n <= 10000000; n = n * 10) {
			int[] input = new int[n];
			for (int i = 0; i < input.length; i++) {
				input[i] = input.length - i;
			}
			
			long startTime = System.currentTimeMillis();
			mergeSort(input, 0, input.length - 1);
			long endTime = System.currentTimeMillis();
			System.out.println("Time by merge sort for " + n + " is " + (endTime - startTime));
		}
	}

}
