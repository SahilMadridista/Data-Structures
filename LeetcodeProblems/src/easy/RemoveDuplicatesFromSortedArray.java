package easy;

public class RemoveDuplicatesFromSortedArray {
	
	static int removeDuplicates(int[] nums) {
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
                    i=j;
                    j=j+1;
                    count++;
                }
            }
        }
        return count;
    }

}
