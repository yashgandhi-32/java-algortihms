package l20;

import java.util.ArrayList;

public class Heap {

	private ArrayList<Integer> data;

	public Heap() {
		data = new ArrayList<>();
		data.add(null);
	}

	public int size() {
		return data.size() - 1;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void insert(int priority) {
		data.add(priority);
		int childIndex = data.size() - 1;
		int parentIndex = childIndex/2;
		while (childIndex != 1) {
			if (data.get(childIndex) >= data.get(parentIndex)) {
				break;
			} else {
				int child = data.get(childIndex);
				int parent = data.get(parentIndex);
				data.set(childIndex, parent);
				data.set(parentIndex, child);
				childIndex = parentIndex;
				parentIndex = childIndex/2;
			}
		}
	}

	public int removeMin() throws HeapEmptyException{
		if (isEmpty()) {
			HeapEmptyException e = new HeapEmptyException();
			throw e;
		}
		int min = data.get(1);
		int last = data.get(data.size() - 1);
		data.set(1, last);
		data.remove(data.size() - 1);
		int currentIndex = 1;
		int leftChildIndex = 2 * currentIndex;
		int rightChildIndex = leftChildIndex + 1;
		
		while (leftChildIndex < data.size()) {
			int minIndex = currentIndex;
			int current = data.get(currentIndex);
			int left = data.get(leftChildIndex);
			if (left < current) {
				minIndex = leftChildIndex;
			}
			
			if (rightChildIndex < data.size()) {
				int right = data.get(rightChildIndex);
				if (right < data.get(minIndex)) {
					minIndex = rightChildIndex;
				}
			}

			if (minIndex == currentIndex) {
				break;
			}
			data.set(currentIndex, data.get(minIndex));
			data.set(minIndex, current);
			currentIndex = minIndex;
			leftChildIndex = 2 * currentIndex;
			rightChildIndex = leftChildIndex + 1;
		}

		return min;
	}

	public int min() throws HeapEmptyException {
		if (isEmpty()) {
			HeapEmptyException e = new HeapEmptyException();
			throw e;
		}
		return data.get(1);
	}

}
