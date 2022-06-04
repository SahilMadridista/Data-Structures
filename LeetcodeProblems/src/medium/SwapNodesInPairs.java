package medium;

public class SwapNodesInPairs {

	public Node swapPairs(Node head) {
        
        if(head==null || head.next==null) return head;
       	    Node start=new Node();
	    	start.next=head;
	    	Node fast=start;
	    	Node slow=start;
	    	while(fast!=null&&fast.next!=null) {
	    		fast=fast.next.next;
	    		slow=slow.next;
	    		if(fast!=null) {
	    			
	    			int temp=fast.data;
	    			fast.data=slow.data;
	    			slow.data=temp;
	    			slow=slow.next;
	    		}
	    	}
	    return head; 
        
    }
	
}
