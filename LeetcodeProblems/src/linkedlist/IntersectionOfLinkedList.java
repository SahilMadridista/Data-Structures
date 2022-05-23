package linkedlist;

public class IntersectionOfLinkedList {

	public Node getIntersectionNode(Node headA, Node headB) {
        
        if(headA == null || headB == null){
            return null;
        }
        
        Node a = headA;
        Node b = headB;
        
        while(a != b){
            
            if(a == null){
                a = headB;
            }else{
                a = a.next;
            }
            
            if(b == null){
                b = headA;
            }else{
                b = b.next;
            }
            
        }
        
        return a;
        
    }
	
}
