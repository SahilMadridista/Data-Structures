package javapractice;

import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {
	
		  
	  // s- house starting point
	  // t- house ending point
	  // a- apple tree point
	  // b- orange tree point	   
	  
	  
	public static void countApplesAndOranges(int s, int t, int a, int b, 
			List<Integer> apples, List<Integer> oranges) {

		int appleCount = 0;
		int orangeCount = 0;
		
		for(int i = 0;i<apples.size();i++) {
			int position = a + apples.get(i);
			if(position>=s && position<=t) {
				appleCount+=1;
			}
			
		}
		
		for(int j = 0;j<oranges.size();j++) {
			int position = b + oranges.get(j);
			if(position>=s && position<=t) {
				orangeCount+=1;
			}
		}
		
		System.out.println(appleCount);
		System.out.println(orangeCount);

	}
	
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(2);
		
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(-2);
		
		countApplesAndOranges(2, 3, 1, 5, list, list2);
		
	}

	
}
