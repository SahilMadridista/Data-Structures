package javapractice;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {

	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		
		int count = 0;
		
		for(int i = 0;i<ar.size()-1;i++) {
						
			for(int j=i;j<ar.size()-1;j++) {
				
				if((ar.get(i) + ar.get(j+1))%k==0) {
					count++;
				}
				
			}		
		}
		
		
		return count;
	}
	
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1;i<=6;i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
		System.out.println(divisibleSumPairs(list.size(), 5, list));
		
	}
	
}
