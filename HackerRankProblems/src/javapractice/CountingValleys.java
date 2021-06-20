package javapractice;

public class CountingValleys {
	
	public static int countingValleys(int steps, String path) {
		int count = 0;
		int numOfValleys = 0;
		
		for(int i = 0;i<path.length();i++) {
			if(path.charAt(i) == 'U') {
				count += 1;
				if(count == 0) {
					numOfValleys += 1;
				}
			}else {
				count -= 1;
			}
		}
		
		return numOfValleys;
	}

	public static void main(String[] args) { 
			
		System.out.println(countingValleys(4,"DDUU"));
	}
	
}
