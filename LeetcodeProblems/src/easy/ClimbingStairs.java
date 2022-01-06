package easy;

public class ClimbingStairs {

	 public int climbStairs(int n) {
		 
		 int arr[] = new int[n+1];
	    	        
		 for(int i = 0; i<n+1;i++){
			 
			 if(i==0||i==1)	               
				 arr[i] = 1;	            
			 else	               
				 arr[i] = arr[i-1] + arr[i-2];
	      	        
		 }   
	        	        
		 return arr[n];
	        
	 }
	
}

// Problem Description -

// You are climbing a staircase. It takes n steps to reach the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
