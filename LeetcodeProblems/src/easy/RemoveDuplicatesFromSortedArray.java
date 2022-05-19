package easy;

public class RemoveDuplicatesFromSortedArray {
	
	public int removeDuplicates(int[] nums) {
        int count = 1;
        if(nums.length == 1){
            return 1;
        }else{
            int i = 0;
            int j = 1;
            while(j!=nums.length){
                if(nums[i] == nums[j]){
                    j=j+1;
                }else{
                    i++;
                    count++;
                    nums[i] = nums[j];
                    j=j+1;
                }
            }
        }
        return count;
    }

}
