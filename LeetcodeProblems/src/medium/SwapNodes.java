package medium;

public class SwapNodes {
	
	/* 
	 
	 Return the head of the linked list after swapping 
	 the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).
	 
	 */
	
	public Node swapNodes(Node head, int k) {
		
        int size=1;
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
            size++;
        }
        
        Node temp2 = head;
        int a=0;
        while(a<size-k){
            temp2=temp2.next;
            a++;
        }
        
        
        Node temp3 = head;
        int b=1;
        while(b<k){
            temp3=temp3.next;
            b++;
        }
        
        int value = temp2.data;
        temp2.data = temp3.data;
        temp3.data = value;
        
        return head;
        
    }
	
	// Alternate solution ( 2 pointer approach )
	
	/*
	
	ListNode slow = head, fast = head, kthfrombegin=head;
    int count = 1;
    while(count < k){
        fast = fast.next;
        count++;
    }
    kthfrombegin = fast;
    while(fast != null && fast.next !=null){
        fast = fast.next;
        slow = slow.next;
    }
    int temp = slow.val;
    slow.val = kthfrombegin.val;
    kthfrombegin.val = temp;
    return head;
    
    */
	

}
