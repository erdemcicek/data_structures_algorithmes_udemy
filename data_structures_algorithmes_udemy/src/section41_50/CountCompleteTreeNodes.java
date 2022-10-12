package section41_50;

public class CountCompleteTreeNodes {

	static int countNodes(TreeNode1 root) {
		
		if(root == null) return 0;
		
		return countNodes(root.left) + countNodes(root.right) + 1;
	}
}



