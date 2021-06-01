package stackimpl;

public class Main {

	public static void main(String[] args) throws Exception {
		
		StackImpl s = new StackImpl();
		
		s.push(12);
		s.push(1);
		s.push(7);
		s.push(20);
		
		s.print();
		System.out.println("");
		System.out.println(s.pop());
		s.print();
		System.out.println("");
		System.out.println(s.peek());
		
	}
	
	
}
