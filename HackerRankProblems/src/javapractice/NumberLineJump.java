package javapractice;

public class NumberLineJump {
	
	public static String kangaroo(int x1, int v1, int x2, int v2) {
    		
		if(v1 == v2){
            return "NO";
        }

        int numberOfJumps = Math.abs((x2-x1)/(v2-v1));
               
        for(int i = 0;i<numberOfJumps;i++) {
            x1 = x1 + v1;
            x2 = x2 + v2;
            
            if(x1 == x2) {
                return "YES";
            }
        }
        
        return "NO";
	}
	
	public static void main(String[] args) {
		
		System.out.println(kangaroo(0, 3, 4, 2));
		
	}

}
