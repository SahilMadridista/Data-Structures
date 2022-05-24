package linkedlist;

public class RemoveDuplicatesFromSortedLinkedList {

	public Node deleteDuplicates(Node head) {
	    
        Node temp = head;
        
        while(temp != null && temp.next != null){
            
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
            
        }
        
        return head;
    }
	
}
