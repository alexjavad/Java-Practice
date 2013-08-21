package graph_search_algorithms;

import java.util.HashSet;

public class GraphNode {
	private int id;
	private HashSet<GraphNode> neighbors;
	
	public GraphNode(int id, HashSet<GraphNode> neighbors) {
		this.id = id;
		this.neighbors = neighbors;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public HashSet<GraphNode> getNeighbors() {
		return neighbors;
	}
}
