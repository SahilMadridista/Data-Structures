package singlelinkedlist;

public class Main {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();
		
		for(int i = 0;i<=10;i++) {
			list.addData(i);
		}
		
		list.add(3, 12);
		list.print();
		
		
	}
	
}
