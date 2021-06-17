package javapractice;

import java.util.List;

public class BillDivision {

	public static void bonAppetit(List<Integer> bill, int k, int b) {
		
		int sum = 0;
		for(int i = 0;i<bill.size();i++) {
			sum = sum + bill.get(i);	
		}
		
		sum = sum-bill.get(k);
		
		if(sum/2 == b) {
			System.out.println("Bon Appetit");
		}else {
			System.out.println(b-sum/2);
		}

	}
	
}
