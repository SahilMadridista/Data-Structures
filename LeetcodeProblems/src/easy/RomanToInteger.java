package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	
	public static void main(String[] args) {
		
		Map<Character, Integer> romanMap = new HashMap<>();
		
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);

		String str = "XXIX"; // value is 29
		
		int value = 0;
		
		for(int i=0;i<str.length();i++) {
			
			if(i>0 && romanMap.get(str.charAt(i)) > romanMap.get(str.charAt(i-1))){	
				value += romanMap.get(str.charAt(i)) - 2*romanMap.get(str.charAt(i-1));
			}else {
				value += romanMap.get(str.charAt(i));
			}
			
		}
		
		System.out.println(value);
		
	}

}
