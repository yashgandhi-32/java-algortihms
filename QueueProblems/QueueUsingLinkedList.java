package l15;

import l12.Node;;

/**
 * Created by jeevan on 19/3/17.
 */
public class QueueUsingLinkedList<T> {
	private Node<T> front;
	private int length;
	private Node<T> back;

	public QueueUsingLinkedList() {
		front = null;
		length = 0;
		back = front;
	}

	public int size() {
		return length;
	}

	public T frontElement() throws QueueEmptyException {
		if (size()==0) {
			throw new QueueEmptyException();
		}
		return front.data;
	}

	public void enqueue(T element) {
		Node<T> newNode = new Node<T>(element);
		if (back != null)  {
			back.next = newNode;
			back = newNode;
		} else {
			front = newNode;
			back = newNode;
		}

		length++;
	}

	public boolean isEmpty(){
		if (size()==0) {
			return true;
		}
		else
			return false;
	}

	public T dequeue() throws QueueEmptyException {

		if (size()==0) {
			throw new QueueEmptyException();
		}
		T dataToBeRemoved = front.data;
		front = front.next;
		length--;
		if (front == null) {
			back = null;
		}
		return dataToBeRemoved;
	}

}

