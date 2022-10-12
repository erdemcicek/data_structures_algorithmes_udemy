package section51_60;

public class ValidateBinarySearchTree {

	private boolean isValidBST(TreeNode1 root) {
		return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	private boolean isValidBST(TreeNode1 root, long min, long max) {
		if(root == null) return true;
		
		return (root.val > min && root.val < max) &&
				isValidBST(root.left, min, root.val) &&
				isValidBST(root.right, root.val, max);
	}
}
