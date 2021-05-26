package doublylinkedlist;


public class DoubleLinkedList {
	
	private Node head;
	
	public DoubleLinkedList() {
		head = null;
	}
	
	// Checking if the list is empty
	
	boolean isEmpty() {
		return head == null;
	}
	
	// Adding node to front
	
	void addToFront(int data) {
		if(isEmpty()) {
			head = new Node(null, data, null);
		}
		else {
			Node newNode = new Node(null, data, head);
			head.previous = newNode;
			head = newNode;
		}
	}
	
	// Adding node to back
	
	void addToBack(int data) {
		if(isEmpty()) {
			head = new Node(null, data, null);
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			
			Node newNode = new Node(temp,data,null);
			temp.next = newNode;
			
		}
	}
	
	// Getting size of the list
	
	int size() {
		int count = 0;
		Node temp = head;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	// Printing the list
	
	void print() {
		Node temp = head;
		while(temp != null) {
			System.err.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	// Node class
	
	static class Node{
		int data;
		Node previous;
		Node next;
		
		public Node(int data) {
			previous = null;
			this.data = data;
			next = null;
		}
		
		public Node(Node previous, int data, Node next) {
			this.previous = previous;
			this.data = data;
			this.next = next;
		}
		
		public int data() {
			return data;
		}
		
	}

}
