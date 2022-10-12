package section51_60;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

	static List<List<Integer>> levelOrder(TreeNode1 root){
		
		List<List<Integer>> ans = new ArrayList<>();
		
		if(root == null) return ans;
		
		List<Integer> temp = new ArrayList<>();
		Queue<TreeNode1> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			TreeNode1 front = q.remove();
			if(front == null) {
				ans.add(temp);
				temp = new ArrayList<>();
				if(!q.isEmpty()) {
					q.add(null);
				}
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
		
		return ans;
	}
}
