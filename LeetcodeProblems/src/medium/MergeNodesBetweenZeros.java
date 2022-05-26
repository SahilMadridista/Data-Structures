package medium;

public class MergeNodesBetweenZeros {
	
	public Node mergeNodes(Node head) {
		
		Node node = head;
        while(node != null)
        { 
            int sum = 0;
            if(node.data == 0){
                
                Node temp = node.next;
                while(temp != null && temp.data != 0){
                    sum += temp.data;
                    temp = temp.next;
                }
                node.data = sum;
                if(temp != null && temp.next != null){
                    node.next = temp;
                }else{
                     node.next = null;
                }
            }
            
            node = node.next;
        }
        
        return head;
		
		
		
		// Alternate solutions in which time limit was exceeding
		
		/* 
		  
		------------1st Solution------------
		
		Node temp = head.next;
	    
	    
	    while(temp.next != null){
	        
	        int dataue = 0;
	        
	        if(temp.data != 0){
	            dataue = dataue + temp.data;
	        }else{
	            Node new_node = new Node(dataue);
	            head.next = new_node;
	            new_node.next = temp;
	            dataue = 0;
	        }
	    }
	    
	    if(head.data == 0){
	        head = head.next;
	    }
	    
	    Node temp2 = head;
	    while(temp2.next.next != null){
	        if(temp2.next.data == 0){
	            temp2.next = temp2.next.next;
	        }
	    }
	    
	    return head;
	    
	    
	    -------------2nd Solution------------
	    
	    ListNode temp = head.next;
        if(temp.val == 0){
            temp=temp.next;
        }
        
        while(temp.next != null){
            int value = 0;
            
            if(temp.val != 0){
                value += temp.val;
            }else{
                ListNode new_node = new ListNode(value);
                head.next = new_node;
                new_node.next = temp.next;
                value = 0;
            }
            
        }
        
        return head.next;
	    
		
		*/
		
	}
	
	
	
	

}
