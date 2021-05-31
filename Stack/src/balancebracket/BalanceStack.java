package balancebracket;
import java.util.Scanner;
import java.util.Stack;

public class BalanceStack {
	
	static String isBalanced(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0;i<s.length();i++) {
			
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			}
			else {
				if(stack.isEmpty()) {
					return "NO";
				}else {
					
					char val = stack.pop();
					
					if(s.charAt(i) == ')' && val != '(') {
						return "NO";
					}
					else if(s.charAt(i) == '}' && val != '{') {
						return "NO";						
					}
					else if(s.charAt(i) == ']' && val != '[') {
						return "NO";
					}
				}
			}
		}

		if(stack.isEmpty()) {
			return "YES";
		}
		else {
			return "NO";
		}

	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the bracket string: ");
		String str = scan.next();
		
		System.out.println(isBalanced(str));
		
		scan.close();
		
	}

}
