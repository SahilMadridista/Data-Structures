package easy;

public class LongestCommonPrefix {
	
	public static void main(String[] args) {
		
		String[] strs = {"flow","flower","flight"};
		
		String prefix = strs[0];

		for(int i = 1;i<strs.length;i++) {
			while(strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0,prefix.length()-1);
			}
		}
		
		System.out.println("The longest common prefix string is: " + prefix);
		
	}

}
