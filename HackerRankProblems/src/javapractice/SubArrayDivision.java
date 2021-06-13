package javapractice;

import java.util.ArrayList;
import java.util.List;

public class SubArrayDivision {

	public static int birthday(List<Integer> s, int d, int m) {
	    
		int count = 0;
		
		for(int i = 0;i<=s.size()-m;i++) {
			int sum = 0;
			for(int j = i;j<i+m;j++) {
				sum = sum + s.get(j);
			}
			if(sum == d) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(2);
		
		System.out.println(birthday(list, 3, 2));
		
	}
	
	
}
