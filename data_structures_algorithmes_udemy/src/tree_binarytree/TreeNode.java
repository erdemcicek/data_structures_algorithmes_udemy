package tree_binarytree;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class TreeNode {
	
	String data;
	ArrayList<TreeNode> children;
	
	public TreeNode(String data) {
		this.data = data;
		this.children = new ArrayList<>();
	}
	
	public static void main(String[] args) {
		TreeNode drinks = new TreeNode("Drinks");
		TreeNode hot = new TreeNode("Hot");
		TreeNode cold = new TreeNode("Cold");
		TreeNode tea = new TreeNode("Tea");
		TreeNode coffee = new TreeNode("Coffee");
		TreeNode beer = new TreeNode("Beer");
		TreeNode wine = new TreeNode("Wine");

		drinks.addChild(hot);
		drinks.addChild(cold);
		hot.addChild(tea);
		hot.addChild(coffee);
		cold.addChild(beer);
		cold.addChild(wine);
		
		
		System.out.println(drinks.printTree(0));

	}
	
	void addChild(TreeNode node) {
		this.children.add(node);
	}
	
	String printTree(int level) {
		var sb = new StringBuilder();
		IntStream.range(0, level)
		.mapToObj(t -> "  ")
		.forEach(t-> sb.append(t));
		
		sb.append(data).append("\n");
		
		for(TreeNode node: children) {
			sb.append(node.printTree(level+1));
		}
		
		return sb.toString();
	}
	
	
	
	

}
