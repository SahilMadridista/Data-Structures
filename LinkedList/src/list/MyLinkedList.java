package list;

public class MyLinkedList {
	
	Node head;
	
	// Add method.
	
	void addData(int data) {
		Node toAdd = new Node(data);
		
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		
		Node temp = head;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
		
	}
	
	// Checking whether the list is empty.
	
	boolean isEmpty() {
		return head == null;
	}
	
	// Print the list method.
	
	void print() {
		Node temp = head;
		if(isEmpty()) {
			System.out.println("List is empty.");
		}
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}
	
	// Getting size of the list method
	
	int size() {
		int count = 0;
		Node temp = head;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	// Deleting / Clearing the list method
	
	void clear() {
		
		while(head != null) {
			head=head.next;
		}
	}
	
	// Getting value from index number
	
	void get(int index) {
		
		if(isEmpty()) {
			System.out.println("List is empty, Can't get anything.");
		}
		else if(index+1>size()) {
			System.out.println("Index value given is greater than list size.");
		}
		else {
			int count = 0;
			Node temp = head;
			while(temp != null) {
				count = count + 1;
				temp = temp.next;
				if(count == index) {
					System.out.println(temp.data);
				}
			}
		}
	}
	
	// Node class
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
		
	}
}
