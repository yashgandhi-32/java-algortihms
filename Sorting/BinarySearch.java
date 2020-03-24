
public class BinarySearch {

	// Search eTBS in input array between begin and end indices. Both Inclusive
	public static int binarySearch(int[] input, int elementToBeSearched, int begin, int end) {
		if (begin > end) {
			return -1;
		}
		
		int mid = (end + begin)/2;
		if (elementToBeSearched == input[mid]) {
			return mid;
		} else if (elementToBeSearched < input[mid]) {
			return binarySearch(input, elementToBeSearched, begin, mid - 1);
		} else {
			return binarySearch(input, elementToBeSearched, mid + 1, end);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
