package doublyendedqueue;

import java.util.ArrayDeque;

public class DoublyEndedQueue {
	
	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		ad.addFirst(2);
		ad.addFirst(5);
		ad.push(3);
		
		// Here addFirst and pop will work the same. 
		
		

		System.out.println(ad.pop());
		System.out.println(ad.peek());

		
	}

}
