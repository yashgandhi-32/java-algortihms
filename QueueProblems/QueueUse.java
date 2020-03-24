package l15;

public class QueueUse {
	
	public static void reverse(QueueUsingArray a) {
		if (a.size() <= 1) {
			return;
		}
		
		int first;
		try {
			first = a.dequeue();
		} catch (QueueEmptyException e) {
			// cant come here
			return;
		}
		reverse(a);
		a.enqueue(first);
	}

	public static void main(String[] args) {
		QueueUsingArray a = new QueueUsingArray();
		for (int i = 0; i < 10; i++) {
			try {
				a.enqueue(i);
			} catch (QueueFullException e) {
				System.out.println("couldnt enqueue " + i);
			}
		}
		
		while (!a.isEmpty()) {
			try {
				System.out.println(a.dequeue());
			} catch (QueueEmptyException e) {
				System.out.println("cant come here");
			}
		}
	}

}
