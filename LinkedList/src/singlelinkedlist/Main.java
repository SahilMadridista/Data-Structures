package singlelinkedlist;

public class Main {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();
		
		for(int i = 1;i<=10;i++) {
			list.addData(i);
		}
		
		list.removeFromIndex(0);
		list.print();
		
		
	}
	
}
