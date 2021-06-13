package javapractice;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {

	public static List<Integer> breakingRecords(List<Integer> scores) {

		int min = 0;
		int max = 0;
		
		int min_score = scores.get(0);
		int max_score = scores.get(0);
		
		for(int i = 1;i<scores.size();i++) {
			if(scores.get(i) > max_score) {
				max_score = scores.get(i);
				max += 1;
			}else if(scores.get(i) < min_score) {
				min_score = scores.get(i);
				min += 1;
			}
		}
		
		List<Integer> l = new ArrayList<>();
		l.add(max);
		l.add(min);
		
		return l;

	}
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(12);
		list.add(24);
		list.add(10);
		list.add(24);
		
		System.out.println(breakingRecords(list));
	}
}
