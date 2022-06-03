package medium;

import java.util.ArrayList;

public class AddTwoNumbers {

	public Node addTwoNumbers(Node l1, Node l2) {
	    Node dum=new Node(0);
	    if(l1==null && l2==null)
	        return null;
	    
	     Node ptr1=l2;
	     Node ptr2=l1;
	   
	    int sizel1=length(l1);
	    int sizel2=length(l2);
	    if(sizel1>=sizel2){
	        ptr1=l1;    
	        ptr2=l2;
	    }
	   
	  
	    int temp=0;
	   while(ptr1!=null){
	       
	       if(ptr2==null){
	           int sum=ptr1.data+temp;
	            ptr1.data=sum%10;
	            temp=sum/10;
	       }
	       else if(ptr2!=null){
	           int sum=ptr1.data+ptr2.data+temp;
	            ptr1.data=sum%10;
	            temp=sum/10;
	            ptr2=ptr2.next;
	       
	       }
	        if(ptr1.next==null && temp>0){
	        dum.data=temp-1;
	        ptr1.next=dum;
	         }
	                 
	        ptr1=ptr1.next;
	        
	    }
	   
	    if(sizel1>=sizel2)
	        return l1;
	    
	     return l2;
	}
	
	public int length(Node n){
	    int size=0;
	    while(n!=null){
	        size+=1;
	        n=n.next;
	    }
	    return size;
	    }
	
}
