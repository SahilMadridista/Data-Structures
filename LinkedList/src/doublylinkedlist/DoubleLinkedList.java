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
	
	// Set method
	
	void set(int index, int value) {
		if(isEmpty()) {
			System.out.println("List is empty, Can't set any value.");
		}
		else if(index+1>size()) {
			System.out.println("Index value given is greater than list size.");
		}
		else {
			int count = 0;
			Node temp = head;
			while(temp != null) {
				if(count == index) {
					temp.data = value;
					break;
				}
				count = count + 1;
				temp = temp.next;
			}
		}
	}
	
	// Printing the list
	
	void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	// Printing the sum
	
	int sum() {
		if(isEmpty()) {
			System.out.println("List is empty.");
		}
		else {
			int sum = 0;
			Node tempNode = head;
			while(tempNode != null) {
				sum = sum + tempNode.data;
				tempNode = tempNode.next;
			}
			return sum;
		}
		return 0;
	}
	
	// Adding node anywhere
	
	void add(int index, int data) {
		
		if(index==0) {
			Node newNode = new Node(null,data,head);
			head.previous = newNode;
			head = newNode;
		}
		else if(index+1>size()) {
			System.out.println("Index value given is greater than list size.");
		}
		else {
			Node newNode = new Node(data);
			Node temp = head;
			Node temp2 = head.next;
			int count = 0;
			while(temp2.next!=null) {
				count++;
				if(count>=index) {
					break;
				}
				temp = temp2;
				temp2 = temp2.next;
			}
			
			temp.next = newNode;
			newNode.previous = temp;

			newNode.next = temp2;
			temp2.previous = newNode;
					
		}
	}
	
	// Getting the value
	
	int get(int index) {
		
		if(isEmpty()) {
			System.out.println("List is empty, Can't get any value.");
		}
		else if(index+1>size()) {
			System.out.println("Index value given is greater than list size.");
		}
		else {
			int count = 0;
			Node temp = head;
			while(temp != null) {
				if(count == index) {
					return temp.data;
				}
				count = count + 1;
				temp = temp.next;
			}
		}
		
		return-1;
	}
	
	// Delete one node from front
	
	void deleteFromFront() {
		head = head.next;
	}
	
	// Delete one node from back
	
	void deleteFromBack() {
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		
	}
	
	// Delete from specific position
	
	void delete(int index) {
		if(index+1>size()) {
			System.out.println("Index value given is greater than list size.");
		}
		else {
			Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            
            temp.next = temp.next.next;
		}
	}
	
	// Reverse the list
	
	void reverse() {
		
		Node curr = head;
		Node prev = null;
		Node next = null;
		
		while(curr!=null) {
			next=curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		head = prev;
		
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
