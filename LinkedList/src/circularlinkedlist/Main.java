package circularlinkedlist;

public class Main {

	public static void main(String[] args) {
		
		CircularLinkedList list = new CircularLinkedList();
		
		for(int i = 0; i<22;i+=3) {
			list.addNode(i);
		}
		
		list.print();
		System.out.println("\nSize is : " + list.size());
		list.get(0);
		
	}
	
	
}
