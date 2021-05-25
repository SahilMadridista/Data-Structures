package singlelinkedlist;

public class Main {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();
		
		for(int i = 0;i<10;i++) {
			list.addData(i);
		}

		list.print();
		System.out.println("\n");
		list.reverse();
		list.print();
		
	}
	
}
