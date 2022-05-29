package linkedlist;

public class MajorityElement {
	
	public int majorityElement(int[] nums) {
        
        int ans_index = 0;
        int count = 1;
        int c = 0;
        
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==nums[ans_index]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                ans_index=i;
                count=1;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[c]==nums[ans_index]){
                c+=1;
            }
        }
        
        return nums[ans_index];
                
    }

}
