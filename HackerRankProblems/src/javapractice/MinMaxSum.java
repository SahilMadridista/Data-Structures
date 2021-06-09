package javapractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {
	
	public static void miniMaxSum(List<Integer> arr) {
		
	        long minSum = 0;
	        long maxSum = 0;
	        
	        Collections.sort(arr);
	        
	        for(int i = 0;i<arr.size()-1;i++){
	            minSum = minSum + arr.get(i);
	        }
	        
	        for(int j = 1;j<arr.size();j++){
	            maxSum = maxSum + arr.get(j);
	        }
	        
	        System.out.println(minSum + " " + maxSum);
	    }
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(32);
		list.add(3);
		list.add(312);
		list.add(62);
		list.add(92);
		
		miniMaxSum(list);
		
		
	}
	
}
