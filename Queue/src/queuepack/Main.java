package queuepack;

public class Main {
	public static void main(String[] args) throws Exception {

		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(12);
		myQueue.enqueue(1);
		myQueue.enqueue(152);
		myQueue.enqueue(17);
		
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.dequeue());
		
		
	}
}
