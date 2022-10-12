package section51_60;

public class InvertBinaryTree {
	
	/*
	TreeNode1 invertTree(TreeNode1 root) {
		
		if(root == null) return root;
		
		swap(root.left, root.right);
		root.left = invertTree(root.left);
		root.right = invertTree(root.right);
		
		return root;
	}

	private void swap(TreeNode1 left, TreeNode1 right) {
		TreeNode1 temp = left;
		left = right;
		right = temp;
	} */
	
	TreeNode1 invertTree(TreeNode1 root) {
		helper(root);
		return root;
	}

	private void helper(TreeNode1 root) {

		if(root == null) return;
		TreeNode1 node = root.left;
		root.left = root.right;
		root.right = node;
		helper(root.left);
		helper(root.right);
	}

}
