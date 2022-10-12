package section51_60;

public class MaxDepthOfBinaryTree {

	static int maxDepth(TreeNode1 root) {
		
		if(root == null) return 0;
		
		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	}
}
