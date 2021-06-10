package javapractice;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
	
	public static List<Integer> gradingStudents(List<Integer> grades) {

		List<Integer> newList = new ArrayList<>();
		
		for(int i = 0;i<grades.size();i++) {
			
			int nextMulOfFive = (int) (Math.ceil((float)grades.get(i)/5)*5);
			
			if(nextMulOfFive-grades.get(i)<3 && grades.get(i)>=38) {
				newList.add(nextMulOfFive);
			}else if(grades.get(i)>38 && nextMulOfFive-grades.get(i)>3) {
				newList.add(grades.get(i));
			}else {
				newList.add(grades.get(i));
			}
			
		}
		
		
		return newList;
	}
	
	
	
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		list.add(73);
		list.add(67);
		list.add(38);
		list.add(33);
		
		System.out.println(list);
		
		System.out.println(gradingStudents(list));
		
	}

}
