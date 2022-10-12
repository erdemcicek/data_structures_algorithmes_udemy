package section51_60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalOrderTraversalBinaryTree {
	
	private static class Element{
		TreeNode1 node;
		int horDistance;
		
		Element(TreeNode1 node, Integer horDistance){
			this.node = node;
			this.horDistance = horDistance;
		}
	}
	

	public List<List<Integer>> verticalTraversal(TreeNode1 root) {
		
        List<List<Integer>> ans = new ArrayList<>();
        
        if(root == null) return ans;
        
        Map<Integer, List<Integer>> map = new TreeMap<>();
        Queue<Element> q = new LinkedList<>();
        q.add(new Element(root, 0));
        
        while(!q.isEmpty()) {
        	Element front = q.remove();
        	int currentHorizontalDistance = front.horDistance;
        	TreeNode1 currentNode = front.node;
        	
        	map.putIfAbsent(currentHorizontalDistance, new ArrayList<>());
        	map.get(currentHorizontalDistance).add(currentNode.val);
        	
        	if(currentNode.left != null) {
        		q.add(new Element(currentNode.left, currentHorizontalDistance - 1));
        	}
        	if(currentNode.right != null) {
        		q.add(new Element(currentNode.right, currentHorizontalDistance + 1));
        	}
        }
        
        for(Entry<Integer, List<Integer>> entry : map.entrySet()) {
        	List<Integer> smallAns = entry.getValue();
        	Collections.sort(smallAns);
        	ans.add(smallAns);
        }
        
        
		return ans ;
    }
}

