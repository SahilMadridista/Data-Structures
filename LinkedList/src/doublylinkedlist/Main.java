package doublylinkedlist;

public class Main {

	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		for(int i = 2; i<=30;i=i+3) {
			list.addToBack(i);
		}
		
		list.print();
		System.out.println("\n");
		list.delete(2);
		System.out.println("\n");
		list.print();
		
	}
	
}
