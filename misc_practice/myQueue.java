package graph_search_algorithms;

import java.util.ArrayList;


public class myQueue {
	ArrayList<Object> data = new ArrayList<Object>();
	
	public void enqueue(Object o) {
		data.add(o);
	}
	
	public Object dequeue() {
		if(!data.isEmpty()) {
			Object firstInLine = data.get(0);
			data.remove(0);
			return firstInLine;
		}
		return null;
	}
	
	public boolean isEmpty() {
		return data.isEmpty();
	}
}
