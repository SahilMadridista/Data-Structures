package stackimpl;

public class Main {

	public static void main(String[] args) {
		
		StackImpl s = new StackImpl();
		
		s.push(6);
		s.push(64);
		s.push(655);
		s.push(6666);
		
		s.print();
		System.out.println("");
		System.out.println(s.pop());
		s.print();
		System.out.println("");
		System.out.println(s.peek());
		
	}
	
	
}
