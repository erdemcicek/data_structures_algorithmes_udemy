package section41_50;

public class SameTree {

	static boolean isSameTree(TreeNode1 p, TreeNode1 q) {
		
		if(p == null && q == null) return true;
		if(p == null && q != null) return false;
		if(p != null && q == null) return false;
		
		if(p.val == q.val 
			&& isSameTree(p.left, q.left) 
			&& isSameTree(p.right, q.right)) {
			return true;
		}
		
		return false;
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
