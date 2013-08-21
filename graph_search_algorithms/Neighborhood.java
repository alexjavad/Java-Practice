package graph_search_algorithms;

import java.util.HashSet;
import java.util.Iterator;

public class Neighborhood {

	static HashSet<GraphNode> answerSet = new HashSet<GraphNode>();

	public static void main(String[] args) {
		
		
	//Setting up the Network
		//Setup Empty Neighbor Sets for each TreeNode in Network
		HashSet<GraphNode> n1 = new HashSet<GraphNode>();
		HashSet<GraphNode> n2 = new HashSet<GraphNode>();
		HashSet<GraphNode> n3 = new HashSet<GraphNode>();
		HashSet<GraphNode> n4 = new HashSet<GraphNode>();
		HashSet<GraphNode> n5 = new HashSet<GraphNode>();
		HashSet<GraphNode> n6 = new HashSet<GraphNode>();
		
		//Create Nodes
		GraphNode graphNode1 = new GraphNode(1, n1);
		GraphNode graphNode2 = new GraphNode(2, n2);
		GraphNode graphNode3 = new GraphNode(3, n3);
		GraphNode graphNode4 = new GraphNode(4, n4);
		GraphNode graphNode5 = new GraphNode(5, n5);
		GraphNode graphNode6 = new GraphNode(6, n6);
		
		
		//Establish TreeNode 1's Neighbors
		n1.add(graphNode2);
		n1.add(graphNode3);
		
		//Establish TreeNode 2's Neighbors
		n2.add(graphNode4);
		n2.add(graphNode1);
		n2.add(graphNode6);
		
		//Establish TreeNode 3's Neighbors
		n3.add(graphNode1);
		
		//Establish TreeNode 4's Neighbors
		n4.add(graphNode5);
		n4.add(graphNode2);
		n4.add(graphNode6);
		
		//Establish TreeNode 5's Neighbors
		n5.add(graphNode4);
		
		//Establish TreeNode 6's Neighbors
		n6.add(graphNode4);
		n6.add(graphNode2);


	//Program Arguments
		//try graphNode1, graphNode2, graphNode3, graphNode4, graphNode5, or graphNode6 for startGraphNode
		GraphNode startGraphNode = graphNode2;
		//try 1, 2, 3, or 4 for numHops
		int numHops = 2;
		
		
		HashSet<GraphNode> resultSet = findNeighborhood(startGraphNode, numHops);
		resultSet.remove(startGraphNode);
		Iterator<GraphNode> i = resultSet.iterator();
		System.out.print("The neighbors of node #" + String.valueOf(startGraphNode.getId()) + " within " + String.valueOf(numHops)+ " hops are: ");
		while(i.hasNext()) {
			System.out.print(String.valueOf(i.next().getId()) + ", ");
		}
	}

	//Returns a HashSet of Nodes which are within n hops from theGraphNode
	public static HashSet<GraphNode> findNeighborhood(GraphNode theGraphNode, int n) {
		HashSet<GraphNode> setOfNeighbors = theGraphNode.getNeighbors();
		Iterator<GraphNode> i1 = setOfNeighbors.iterator();
		if(n==1) {
			while(i1.hasNext()) {
				GraphNode currNeighbor = i1.next();
				answerSet.add(currNeighbor);
			}
		}
		else {
			while(i1.hasNext()) {
				GraphNode currNeighbor = i1.next();
				answerSet.add(currNeighbor);
				Iterator<GraphNode> i2 = findNeighborhood(currNeighbor, n-1).iterator();
				while(i2.hasNext()) {
					answerSet.add(i2.next());
				}
			}
		}
		return answerSet;
	}

}
