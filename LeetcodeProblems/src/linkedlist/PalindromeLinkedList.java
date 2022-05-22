package linkedlist;

public class PalindromeLinkedList {
	
	public boolean isPalindrome(Node head) {
        
        if(head == null){
            return true;
        }
        
        Node mid = middle(head);
        Node last = reverse(mid);
        Node curr = head;
        while(last!=null){
            if(last.data != curr.data){
                return false;
            }
            last = last.next;
            curr = curr.next;
        }
        
        return true;
         
    }
   
    static Node middle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev;
    }

}
