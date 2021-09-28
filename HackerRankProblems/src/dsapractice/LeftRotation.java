package dsapractice;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
	
	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
	    
	        int size = arr.size();
	        List<Integer> newList = new ArrayList<>();
	        int rot_index = d;
	        
	        while(rot_index<size){
	            newList.add(arr.get(rot_index));	           
	            rot_index++;            
	        }
	        
	        rot_index = 0;
	        
	        while(rot_index<d){
	            newList.add(arr.get(rot_index));
	            rot_index++;  
	        }
	    
	        return newList;
	        

	    }

}
