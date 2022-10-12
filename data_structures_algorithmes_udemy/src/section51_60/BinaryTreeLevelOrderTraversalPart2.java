package section51_60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;


import java.util.LinkedList;

public class BinaryTreeLevelOrderTraversalPart2 {
	
	public List<List<Integer>> levelOrderBottom(TreeNode1 root) {
		
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
        
        Collections.reverse(ans);
        
		return ans;
    }

}

class TreeNode1{
	int val;
	TreeNode1 left;
	TreeNode1 right;
	TreeNode1() {}
	TreeNode1(int val){ this.val = val;}
	TreeNode1(int val, TreeNode1 left, TreeNode1 right){
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
