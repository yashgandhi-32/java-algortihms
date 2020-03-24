package l15;

public class QueueUsingArray {
	private int data[];
	private int nextIndex;
	private int firstIndex;
	private int size;

	
	public QueueUsingArray() {
		data = new int[5];
		nextIndex = 0;
		size = 0;
		firstIndex = -1;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	private void resize() {
		int temp[] = new int[data.length * 2];
		int k = 0;
		for (int i = firstIndex; i < data.length; i++) {
			temp[k] = data[i];
			k++;
		}
		for (int i = 0; i < nextIndex; i++) {
			temp[k] = data[i];
			k++;
		}
		data = temp;
		firstIndex = 0;
		nextIndex = k;
	}
	
	public void enqueue(int element) {
		if (size == data.length) {
			resize();
		}
		data[nextIndex] = element;
		size++;
		if (size == 1) {
			firstIndex = 0;
		}
		nextIndex = (nextIndex + 1) % data.length;
	}
	
	public int dequeue() throws QueueEmptyException {
		if (size == 0) {
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		int tobereturned = data[firstIndex];
		firstIndex = (firstIndex + 1) % data.length;
		size--;
		if (size == 0) {
			firstIndex = -1;
			nextIndex = 0;
		}
		return tobereturned;
	}
	
	public int front() throws QueueEmptyException {
		if (size == 0) {
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		return data[firstIndex];
	}
	
}
