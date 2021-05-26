package doublylinkedlist;

public class Main {

	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		for(int i = 0; i<=21;i=i+3) {
			list.addToBack(i);
		}
		
		list.print();
		
	}
	
}
