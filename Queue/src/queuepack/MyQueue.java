package queuepack;

public class MyQueue {
	
	Node head;
	Node rear;
	
	public MyQueue() {
		head = null;
		rear = null;
	}
	
	void enqueue(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = rear = newNode;
			return;
		}
		
		rear.next = newNode;
		rear = newNode;
		
	}
	
	int dequeue() throws Exception {
		
		if(head == null) {
			throw new Exception("Can't take element from empty queue.");
		}
		Node toRemove = head;
		
		head = head.next;
		
		if(head == null) {
			rear = null;
		}
		
		return toRemove.data;
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
