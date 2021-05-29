package circularlinkedlist;

public class CircularLinkedList {
	
	Node head;
    Node tail;
    
    public CircularLinkedList() {
    	this.head = null;
    	this.tail = null;
    }
	
	public void addNode(int value) {
		
	    Node newNode = new Node(value);

	    if(head == null) {
	    	head = newNode;  
	        tail = newNode;  
	        newNode.next = tail;
	    }  
	    else {	    	
	    	tail.next = newNode;  
	    	tail = newNode;
	    	tail.next = head;  
       }
	    
	}
	
	void print() {
		
		if(isEmpty()) {
			System.out.println("List is empty.");
			return;
		}
		
		Node temp = head;
		
		while(temp != tail) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print(temp.data + " ");
		
	}
	
	boolean isEmpty() {
		return head == null;
	}
	
	int size() {
		if(isEmpty()) {
			return 0;
		}else {
			Node temp = head;
			int count = 0;
			while(temp != tail) {
				count++;
				temp = temp.next;
			}
			count++;
			return count;
		}
	}
	
	void clear() {
		if(isEmpty()) {
			System.out.println("List is already empty.");
		}
		else {
			tail.next = null;
			while(head != null) {
				head = head.next;
			}
			System.out.println("List cleared.");
		}
	}
	
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
			while(temp != tail) {
				if(count == index) {
					System.out.println(temp.data);
					break;
				}
				count = count + 1;
				temp = temp.next;
			}
		}
	}
	
	// All methods are same as singly linked list. 
	// We just have to point the last node to the head node.
	
	
	
	
	
}
