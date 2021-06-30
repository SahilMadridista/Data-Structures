package tree;

import java.util.Scanner;

public class MyTree {
	
	static Scanner scan = null;
	
	public static void main(String[] args) {
		createTree();
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
	
	
	
}
