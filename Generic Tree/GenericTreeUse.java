package l16_17;

import java.util.Scanner;

public class GenericTreeUse {

	public static int numNodes(GenericTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		
		int count = 1;
		for (int i = 0; i < root.children.size(); i++) {
			count += numNodes(root.children.get(i));
		}
		return count;
	}
	
	// 1 3 2 3 6 0 7 0 8 0 3 0 4 2 9 0 10 0
	public static GenericTreeNode<Integer> takeInput(Scanner s) {
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		GenericTreeNode<Integer> root = new GenericTreeNode<>(rootData);
		System.out.println("Enter num children for " + rootData);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			GenericTreeNode<Integer> nextChild = takeInput(s);
			root.children.add(nextChild);
		}
		return root;
	}
	
	public static void print(GenericTreeNode<Integer> root) {
		System.out.print(root.data + ":");
		for (int i = 0; i < root.children.size(); i++) {
			System.out.print(root.children.get(i).data + ",");
		}
		System.out.println();
		
		for (int i = 0; i < root.children.size(); i++) {
			print(root.children.get(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		GenericTreeNode<Integer> root = takeInput(s);
		print(root);
	}

}
