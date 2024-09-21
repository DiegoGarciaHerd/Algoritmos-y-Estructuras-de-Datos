package tp1.ejercicio8;

import java.util.LinkedList;
import java.util.List;

public class Queue <T> extends Sequence {
	protected List<T> data;
	
	public Queue() {
		data = new LinkedList<T>();
	}
	
	public void enqueue(T dato) {
		data.add(dato);
	}
	
	public T dequeue() {
		return this.data.remove(0);
	}
	
	public T head() {
		return this.data.get(0);
	}
	
	public boolean isEmpty() {
		return data.size() == 0;
	}
	
	public int size() {
		return data.size();
	}
	
	public String toString() {
		String str = "[";
		for(T d: data)
		str = str + d +", ";
		str = str.substring(0, str.length()-2)+"]";
		return str;
	}
}
