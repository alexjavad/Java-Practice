package tree_search_algorithms;

import java.util.ArrayList;


public class myQueue<T> {
	ArrayList<T> data = new ArrayList<Object>();
	
	public void enqueue(T o) {
		data.add(o);
	}
	
	public T dequeue() {
		if(!data.isEmpty()) {
			T firstInLine = data.get(0);
			data.remove(0);
			return firstInLine;
		}
		return null;
	}
	
	public boolean isEmpty() {
		return data.isEmpty();
	}
}
