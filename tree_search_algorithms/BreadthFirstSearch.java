package tree_search_algorithms;

import java.util.ArrayList;
import java.util.Iterator;


public class BreadthFirstSearch {

	static myQueue q = new myQueue();

	public static void main(String[] args) {
		//Setting up the Tree

		//Create Nodes
		TreeNode treeNode1 = new TreeNode(1);
		TreeNode treeNode2 = new TreeNode(2);
		TreeNode treeNode3 = new TreeNode(3);
		TreeNode treeNode4 = new TreeNode(4);
		TreeNode treeNode5 = new TreeNode(5);



		//Establish TreeNode 1's Children
		treeNode1.addChild(treeNode2, treeNode3, treeNode4);

		//Establish TreeNode 2's Children


		//Establish TreeNode 3's Children
		treeNode3.addChild(treeNode5);

		//Establish TreeNode 4's Children


		//Establish TreeNode 5's Children


		//TODO: The return value of BFS should be an ArrayList of TreeNode's. Print their id's here.
		ArrayList<TreeNode> BFSresult = BFS(treeNode1);
		Iterator<TreeNode> i = BFSresult.iterator();
		while(i.hasNext()) {
			System.out.print(i.next().getId() + " ");
		}

	}

	//BFS: given a TreeNode, returns an ArrayList of those TreeNode's as explored by BFS
	public static ArrayList<TreeNode> BFS(TreeNode root) {
		ArrayList<TreeNode> result = new ArrayList<TreeNode>();
		q.enqueue(root);
		while(!q.isEmpty()) {
			TreeNode examinedTreeNode = (TreeNode) q.dequeue();
			result.add(examinedTreeNode);
			for(TreeNode child : examinedTreeNode.getChildren()) {
				q.enqueue(child);
			}
		}

		return result;
	}

}



































