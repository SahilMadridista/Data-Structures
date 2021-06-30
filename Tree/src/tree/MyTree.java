package tree;

import java.util.Scanner;

public class MyTree {
	
	static Scanner scan = null;
	
	public static void main(String[] args) {
		Node root = createTree();
		System.out.println();
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);
	}
	
	static Node createTree() {
		
		scan = new Scanner(System.in);
		Node root = null;
		System.out.println("Enter data: ");
		int data = scan.nextInt();
		if(data == -1) {
			return null;
		}
		root = new Node(data);
		System.out.println("Enter left for " + data);
		root.left = createTree(); // 6
		
		System.out.println("Enter right for " + data);
		root.right = createTree(); // -1 null
		
		return root;
		
	}
	
	static void inOrder(Node root) {
		
		// Left - Node - Right
		
		if(root == null) return;
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
		
	}
	
	static void preOrder(Node root) {
		
		// Node - Left - Right
		
		if(root == null) return;
		
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
		
	}
	
	static void postOrder(Node root) {
		
		// Left - Right - Node
		
		if(root == null) return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
		
	}
	
	
	
}
