package stackusinglinkedlist;

public class MyStack {
	
	Node head;
	
	void push(int data) {
		
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
	
	int pop() throws Exception {
		
		Node temp = head;
		
		if(isEmpty()) {
			throw new Exception("Can not pop from empty stack");
		}
		else if(head.next == null) {
			Node toPop = head;
			head = null;
			return toPop.data;
		}
		
		else {
			while(temp.next.next != null) {
				temp = temp.next;
			}
			
			Node toPop = temp.next;
			temp.next = null;
			
			return toPop.data;
		}
		
			
	}
	
	int peek() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("Can not peek from empty stack");
		}
		else {
			Node temp = head;
			
			while(temp.next != null) {
				temp = temp.next;
			}
			
			return temp.data;
		}
		
	}
	
	boolean isEmpty() {
		return head == null;
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
	
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
		
	}


}
