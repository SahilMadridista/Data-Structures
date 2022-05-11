package linkedlist;

public class ReverseTheLinkedList {
	public Node reverseList(Node head) {
        
        Node prev = null;
        Node curr = head;
        while(curr!=null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev;
          
    }
}
