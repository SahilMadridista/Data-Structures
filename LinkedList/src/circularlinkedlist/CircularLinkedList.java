package circularlinkedlist;

public class CircularLinkedList {

	Node head = null;
    Node tail = null;
	
	public void addNode(int value) {
		
	    Node newNode = new Node(value);

	    if(head == null) {
	    	head = newNode;  
	        tail = newNode;  
	        newNode.next = head;
	    }  
	    else {	    	
	    	tail.next = newNode;  
	    	tail = newNode;  
	    	tail.next = head;  
       }
	    
	}
	
	void print() {
		
		Node temp = tail.next;
		while(temp != tail) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print(temp.data + " ");
		
	}
	
	boolean isEmpty() {
		return tail == null;
	}
	
	
}
