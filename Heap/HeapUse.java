package l20;

import java.util.PriorityQueue;

public class HeapUse {

	public static void sortAlmostSorted(int a[], int k) {
		
	}
	
	public static int[] kMaximum(int a[], int k) {
		
	}
	
	public static void main(String[] args) {
		Heap h = new Heap();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		int a[] = {3,2,4,5,1,10,7,8};
		for (int element : a) {
			h.insert(element);
			pq.add(element);
		}
		
		
		while (!h.isEmpty()) {
			try {
				System.out.println(h.removeMin());
				System.out.println(pq.remove());
			} catch (HeapEmptyException e) {
				// cant come here
				System.out.println("ERRORRR");
			}
		}
		
	}

}
