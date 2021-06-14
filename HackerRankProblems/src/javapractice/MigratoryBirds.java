package javapractice;

import java.util.ArrayList;
import java.util.List;

public class MigratoryBirds {

	public static int migratoryBirds(List<Integer> arr) {

		int[] nums = new int[5];
		
		for(int i=0;i<arr.size();i++) {
			
			switch (arr.get(i)) {
				case 1:
					nums[0]++;
					break;
				case 2:
					nums[1]++;
					break;
				case 3:
					nums[2]++;
					break;
				case 4:
					nums[3]++;
					break;
				case 5:
					nums[4]++;
					break;
					
				default:
					System.out.println("Error");
						
			}
			
		}
		
		int highest = 0;
		int answer = 0;
		
		for(int i = 0;i<nums.length;i++) {
			if(nums[i]>highest) {
				highest = nums[i];
				answer = i+1;
			}
		}
		
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(5);
		list.add(3);
		
		
	}
}
