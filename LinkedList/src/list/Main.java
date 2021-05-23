package list;

public class Main {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();
		
		for(int i=0;i<8;i++) {
			list.addData(i);
		}

		list.clear();
		System.out.println(list.size());
		list.print();
		
	}
	
}
