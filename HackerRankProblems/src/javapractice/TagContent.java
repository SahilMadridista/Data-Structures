package javapractice;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContent {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
			boolean matchFound = false;
            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
			
            Matcher match = pattern.matcher(line);
            while(match.find()){
                System.out.println(match.group(2));
                matchFound = true;
            }
            
            if(!matchFound){
                System.out.println("None");
            }
			
			testCases--;
		}
		
		in.close();
	}
	
}
