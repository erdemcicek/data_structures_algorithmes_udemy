package section81_90;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CourseSchedule {
	
	public static void main(String[] args) {
		System.out.println(canFinish(2, new int[][] {{1,0}}));
	}
	
	private static boolean canFinish(int numCourses, int[][] pre) {
		
		Map<Integer, List<Integer>> graph = new HashMap<>();
		int[] in_degree = new int[numCourses];
		
		for(int i = 0 ; i < pre.length ; i++) {
			int ai = pre[i][0];
			int bi = pre[i][1];
			if(graph.get(bi) == null) {
				graph.put(bi, new ArrayList<>());
			}
			graph.get(bi).add(ai);
			in_degree[ai]++;
		}
		
		Queue<Integer> q = new LinkedList<>();
		for(int i = 0 ; i < in_degree.length ; i++) {
			if(in_degree[i] == 0) {
				q.add(i);
			}
		}
		
		int finished = 0;
		while(!q.isEmpty()) {
			int node = q.remove();
			finished++;
			
			List<Integer> children = graph.get(node);
			if(children != null) {
				for(int i = 0 ; i < children.size() ; i++) {
					in_degree[children.get(i)]--;
					if(in_degree[children.get(i)] == 0) {
						q.add(children.get(i));
					}
				}
			}
		}
	
		return finished == numCourses;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
