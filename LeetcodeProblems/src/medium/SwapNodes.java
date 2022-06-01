package medium;

public class SwapNodes {
	
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

}
