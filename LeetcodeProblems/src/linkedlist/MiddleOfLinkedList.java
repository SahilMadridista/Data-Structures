package linkedlist;

public class MiddleOfLinkedList {

	public Node middleNode(Node head) {
        
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
        
    }
	
}
