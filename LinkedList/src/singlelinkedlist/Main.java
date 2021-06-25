package singlelinkedlist;

public class Main {
	
	

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();
		
		
		list.add(0, 100);
		list.add(0, 12);
		list.print();
		System.out.println("");
		list.printHead();
		
		
	}
	
}
