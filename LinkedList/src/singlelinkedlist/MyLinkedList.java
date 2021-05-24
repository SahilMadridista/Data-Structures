package singlelinkedlist;

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
					System.out.println(temp.data);
					break;
				}
				count = count + 1;
				temp = temp.next;
			}
		}
	}

	// Set value at specific index
	
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
	
	// Remove value from specific index
	
	void removeFromIndex(int index) {
		
		if(index==0) {
			head=head.next;
		}
		else if(index+1>size()) {
			System.out.println("Index value given is greater than list size.");
		}
		else {
			
			Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            
            temp.next = temp.next.next;
            
//             values:  0   1   2   3   4   5   6   7   8   9   10
//             index:   0   1   2   3   4   5   6   7   8   9   10
		}
	}
	
	// adding element at specific index
	
	void add(int index, int value) {
		
		Node temp = new Node(value);
		if(index==0) {		
	        temp.data = value;
	        temp.next = head;
	        head = temp;
		}
		else if(index+1>size()) {
			System.out.println("Index value given is greater than list size.");
		}
		else {
			
			Node tempNode = head;
			Node tempNode2 = head.next;
			int count=0;
			while(/* tempNode!=null || */ tempNode2 != null) {
				count++;
				if(count>=index) {
					break;
				}
				tempNode = tempNode2;
				tempNode2=tempNode2.next;
			}
			tempNode.next = temp;
			temp.next = tempNode2;			
			
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
