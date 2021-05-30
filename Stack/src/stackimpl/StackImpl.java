package stackimpl;

public class StackImpl {
	
	Node head;
	
	void push(int data) {
		Node temp =  new Node(data);
		temp.data = data;;
        temp.next = head;
        head = temp;
	}
	
	int pop() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("Can not pop from empty stack");
		}
		else if(head.next == null) {
			Node toPop = head;
			head = null;
			return toPop.data;
		}
		else {
			Node toPop = head;
			head = head.next;
			return toPop.data;
		}
		
	}
	
	int peek() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("Can not peek from empty stack");
		}
		else {
			return head.data;
		}
		
	}
	
	void print() {
		Node temp = head;
		if(isEmpty()) {
			System.out.println("Stack is empty.");
		}
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}
	
	boolean isEmpty() {
		return head == null;
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
