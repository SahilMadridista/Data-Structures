package vector;

import java.util.Vector;

public class MainClass {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();
		
		for(int i = 1;i<11;i++) {
			v.add(i);
		}
		
		System.out.println(v);
	}
	
}
