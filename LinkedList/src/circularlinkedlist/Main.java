package circularlinkedlist;

public class Main {

	public static void main(String[] args) {
		
		CircularLinkedList list = new CircularLinkedList();
		
		for(int i = 2;i<15;i=i+2) {
			list.addNode(i);
		}
		
		list.print();
		
		
	}
	
	
}
