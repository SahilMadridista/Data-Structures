package easy;

import java.util.Arrays;

public class SquaresOfSortedArray {

	public int[] sortedSquares(int[] nums) {
		
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        
        Arrays.sort(nums);
        // We can use any sorting algorithm here
        
        return nums;
        
    }
	
}
