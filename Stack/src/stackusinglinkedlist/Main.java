package stackusinglinkedlist;

public class Main {

	public static void main(String[] args) throws Exception {
		
		MyStack myStack = new MyStack();
		
//		for(int i = 1; i<20; i=i*2) {
//			myStack.push(i);
//		}
		
		myStack.push(2);
		myStack.push(4);

		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.peek());
		
	}
	
}
