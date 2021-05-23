package list;

public class MyLinkedList {
	
	Node head;
	
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
	
	boolean isEmpty() {
		return head == null;
	}
	
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
	
	int size() {
		int count = 0;
		Node temp = head;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	void clear() {
		
		while(head != null) {
			head=head.next;
		}
	}
	
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
		
	}
}
