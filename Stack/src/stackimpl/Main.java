package stackimpl;

public class Main {

	public static void main(String[] args) throws Exception {
		
		StackImpl s = new StackImpl();
		
		
		s.print();
		System.out.println("");
		System.out.println(s.pop());
		s.print();
		System.out.println("");
		System.out.println(s.peek());
		
	}
	
	
}
