package linkedlist;

public class BinaryToDecimalFromLinkedList {

	public int getDecimalValue(Node head) {
        
        int sum = 0;
        while(head != null){
            int value = head.data;
            sum = (sum * 2) + value;
            head = head.next;
        }
        return sum;
        
    }
	
}
