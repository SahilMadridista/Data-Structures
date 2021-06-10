package javapractice;

import java.util.ArrayList;
import java.util.List;

public class BirthdayCakeCandle {
	
	public static int birthdayCakeCandles(List<Integer> candles) {

		int count = 0;
		int max = candles.get(0);
		
		/* In this for loop, we are getting the maximum value present in the list */
		
		for(int i = 0;i<candles.size();i++) {
			if(max<candles.get(i)) {
				max = candles.get(i);
			}
		}
		
		/* In this for loop, we are counting the occurances of maximum element */
		
		for(int i = 0;i<candles.size();i++) {
			if(max == candles.get(i)) {
				count+=1;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(4);
		list.add(1);
		list.add(2);
		
		System.out.println(birthdayCakeCandles(list));
		
	}

}


