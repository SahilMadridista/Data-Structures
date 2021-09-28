package dsapractice;

import java.util.List;

public class TwoDArray {
	
	public static int hourglassSum(List<List<Integer>> arr) {
	    
	    int maximum_hourglass_sum = Integer.MIN_VALUE;
	        
	    int rows = arr.size();
	    int columns = arr.get(0).size();
	    
	    for(int i = 0;i<rows-2;i++) {
	    	for(int j = 0;j<columns-2;j++) {
	    		int current_sum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2)
	    											+ arr.get(i+1).get(j+1)
	    						+ arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
	    		
	    		maximum_hourglass_sum = Math.max(maximum_hourglass_sum, current_sum);
	    		
	    	}
	    }
	        
	    return maximum_hourglass_sum;  

	}
	

}
