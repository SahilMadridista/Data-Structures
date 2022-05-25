package easy;

public class DecompressRunLengthEncodedList {
	
	public int[] decompressRLElist(int[] nums) {
        
        int n = nums.length;
        int new_arr_length = 0;
        for(int i=0;i<n;i+=2){
            new_arr_length += nums[i];
        }
        
        int[] new_arr = new int[new_arr_length];
        
        int j = 0;
        for(int i=0;i<nums.length;i+=2){
            int freq = nums[i];
            int val = nums[i+1];
            
            while(freq>0){
                new_arr[j] = val;
                j++;
                freq--;
            }
            
        }
        
        return new_arr;
        
    }
	
}
