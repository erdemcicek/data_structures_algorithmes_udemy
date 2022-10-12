package section41_50;

public class SymmetricBinaryTree {

	static boolean isSymmetric(TreeNode1 root) {
		
		if(root == null) return true;
		
		return helper(root.left, root.right);
	}
	
	static boolean helper(TreeNode1 leftTree, TreeNode1 rightTree) {
		if(leftTree == null && rightTree != null) return false;
		if(leftTree != null && rightTree == null) return false;
		if(leftTree == null && rightTree == null) return true;
		if(leftTree.val != rightTree.val) return false;
		return helper(leftTree.left, rightTree.right) 
				&& helper(leftTree.right, rightTree.left);
	}
}


