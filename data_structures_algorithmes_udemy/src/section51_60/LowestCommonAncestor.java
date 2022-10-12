package section51_60;

public class LowestCommonAncestor {
	
	
	// For BST
	TreeNode1 lowestCommonAncestorBST(TreeNode1 root, TreeNode1 p, TreeNode1 q) {
		
		while(root != null) {
			if(root.val > p.val && root.val > q.val) {
				root = root.left;
			} else if(root.val < p.val && root.val < q.val) {
				root = root.right;
			} else {
				return root;
			}
			
		}
		
		return null;
	}
	
	
	// For BT
	TreeNode1 lowestCommonAncestorBT(TreeNode1 root, 
								TreeNode1 p, TreeNode1 q) {
		
		if(root == null) {
			return null;
		}
		
		if(root.val == p.val || root.val == q.val) {
			return root;
		}
		
		TreeNode1 left = lowestCommonAncestorBT(root.left, p, q);
		TreeNode1 right = lowestCommonAncestorBT(root.right, p, q);
		
		if(left == null && right == null) {
			return null;
		} else if(left == null && right != null) {
			return right;
		} else if(left != null && right == null) {
			return left;
		}
		
		return root;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
