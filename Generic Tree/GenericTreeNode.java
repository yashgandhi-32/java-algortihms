package l16_17;

import java.util.ArrayList;

public class GenericTreeNode<T> {
	public T data;
	public ArrayList<GenericTreeNode<T>> children;
	
	public GenericTreeNode(T data) {
		this.data = data;
		children = new ArrayList<>();
	}
	
}
