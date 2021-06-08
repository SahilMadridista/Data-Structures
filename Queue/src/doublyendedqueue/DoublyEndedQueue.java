package doublyendedqueue;

import java.util.ArrayDeque;

public class DoublyEndedQueue {
	
	public static void main(String[] args) {
		// Code goes here
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.addFirst(2);
		ad.addLast(5);
		
		System.out.println(ad.peekFirst());
		
		System.out.println(ad.peekLast());
		
		ad.removeFirst();
		
		System.out.println(ad.getFirst());
		
		System.out.println(ad.getLast());
		
	}

}
