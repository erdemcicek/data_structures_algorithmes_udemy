package section51_60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigZagLevelOrderTraversal {

	 public List<List<Integer>> zigzagLevelOrder(TreeNode1 root) {
		List<List<Integer>> ans = new ArrayList<>();
		
		if(root == null) return ans;
		
		List<Integer> temp = new ArrayList<>();
		Queue<TreeNode1> q = new LinkedList<>();
		
		q.add(root);
		q.add(null);
		boolean isOddIndex = false;
		while(!q.isEmpty()) {
			TreeNode1 front = q.remove();
			if(front == null) {
				if(isOddIndex) {
					Collections.reverse(temp);
				}
				ans.add(temp);
				temp = new ArrayList<>();
				if(!q.isEmpty()) {
					q.add(null);
				}
				isOddIndex = !isOddIndex;
			} else {
				temp.add(front.val);
				if(front.left != null) {
					q.add(front.left);
				}
				if(front.right != null) {
					q.add(front.right);
				}
			}
		}
		 
		return ans ;
	 }
}
