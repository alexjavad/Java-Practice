package tree_search_algorithms;

import java.util.ArrayList;

public class TreeNode {
	private int id;
	private ArrayList<TreeNode> children = new ArrayList<TreeNode>();
	
	public TreeNode(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void addChild(TreeNode... treeNodes) {
		for(int i=0; i< treeNodes.length; i++) {
			children.add(treeNodes[i]);
		}
	}
	
	public ArrayList<TreeNode> getChildren() {
		return this.children;
	}
}
