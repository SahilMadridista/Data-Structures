package vector;

import java.util.Vector;

public class MainClass {

	public static void main(String[] args) {
		
		// Same as arraylist.
		// It locks the operation.
		// Same functions as arraylist.
		// It takes more memory than arraylist.
		// Vectors are thread safe but less efficient.
		
		Vector<Integer> v = new Vector<>();
		
		for(int i = 1;i<11;i++) {
			v.add(i);
		}
		
		System.out.println(v);
	}
	
}
