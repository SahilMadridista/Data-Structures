package linkedlist;

public class RemoveLinkedListElements {

	public Node removeElements(Node head, int val) {
        
        while(head != null && head.data == val){
            head = head.next;
        }
        
        Node temp = head;
        
        while(temp != null && temp.next != null){
            if(temp.next.data == val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        
        return head;
        
    }
		
}
