package javapractice;

import java.util.List;

public class DesignerPDFViewer {

	public static int designerPdfViewer(List<Integer> h, String word) {
	        
		int max = 0;
	    for(int i = 0;i<word.length();i++){
	            
	        char ch = word.charAt(i);
	        int ind = ch-97;
	        int newMax = h.get(ind);
	        if(newMax>max){
	            max = newMax;
	        }
	    }
	        
	    return max*word.length();
	    

	}
	
}
