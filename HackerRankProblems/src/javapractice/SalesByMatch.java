package javapractice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SalesByMatch {
	
	public static int sockMerchant(int n, List<Integer> ar) {

		int count = 0;
		Set<Integer> set = new HashSet<>();
		set.add(ar.get(0));
		for(int i = 1;i<ar.size();i++) {
			
			if(set.contains(ar.get(i))) {
				set.remove(ar.get(i));
				count++;
			}else {
				set.add(ar.get(i));
			}
				
		}
		
		return count;
	}
	
	public static void main(String[] args) {

		
	}

}
