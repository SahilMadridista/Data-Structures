package graphds;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

	private LinkedList<Integer> adj[];
	
	public Graph(int v) {
		adj = new LinkedList[v];
		
		for(int i = 0;i<v;i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public static void main(String[] args) {

		ArrayList<Integer>[] vertex = new ArrayList[6];
		
		for(int i = 0;i<6;i++) {
			vertex[i] = new ArrayList<>();
		}

		vertex[0].add(2);
		vertex[0].add(12);
		vertex[0].add(22);
		vertex[0].add(32);
		
		System.out.println(vertex[0]);
	

	}

}
