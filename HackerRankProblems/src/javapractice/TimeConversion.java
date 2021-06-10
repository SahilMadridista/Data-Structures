package javapractice;

public class TimeConversion {

	 public static String timeConversion(String str) {

		 int hour = 0;
		 
		 if(str.substring(str.length()-2,str.length()).equals("PM")) {
			 if(Integer.parseInt(str.substring(0,2)) == 12) {
				 str = 12 + str.substring(2,str.length()-2);
			 }else {
				 hour = Integer.parseInt(str.substring(0,2)) + 12;
				 str = hour + str.substring(2,str.length()-2);
			 }
		 }else {
			 if(Integer.parseInt(str.substring(0,2)) == 12) {
				 str = "00" + str.substring(2,str.length()-2);
			 }else {
				 str = str.substring(0,str.length()-2);
			 }
		 } 

		 return str;
	 }
	
	public static void main(String[] args) {
		
		String str = "12:40:22AM";

		
		System.out.println(str);
		
		System.out.println(timeConversion(str));
	}
	
}
