package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	
	public static void main(String[] args) {
		
		Map<Character, Integer> romanMap = new HashMap<>();
		
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		
		System.out.println(romanMap);
		
	}

}
