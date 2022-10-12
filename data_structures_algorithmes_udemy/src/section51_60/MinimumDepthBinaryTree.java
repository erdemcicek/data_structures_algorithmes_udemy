package section51_60;

import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class MinimumDepthBinaryTree {
	
	/*  InOrder   L D R
	 *  PreOrder  D L R
	 *  PostOrder L R D
	 
	 */
	
	private static class Q_Item{
		TreeNode1 node;
		int depth;
		
		Q_Item(TreeNode1 node, int depth){
			this.node = node;
			this.depth = depth;
		}
		
	}
	
	int minDepth(TreeNode1 root) {
		 
		if(root == null) return 0;
		
		Queue<Q_Item> q = new LinkedList<>();
		Q_Item q_item = new Q_Item(root, 1);
		q.add(q_item);
		
		while(!q.isEmpty()) {
			Q_Item front = q.remove();
			
			TreeNode1 currNode = front.node;
			int currDepth = front.depth;
			
			// leaf node
			if(currNode.left == null && currNode.right == null) {
				return currDepth;
			}
			if(currNode.left != null) {
				Q_Item a = new Q_Item(currNode.left, currDepth + 1);
				q.add(a);
			}
			if(currNode.right != null) {
				Q_Item a = new Q_Item(currNode.right, currDepth + 1);
				q.add(a);
			}
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
