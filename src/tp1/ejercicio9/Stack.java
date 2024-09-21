package tp1.ejercicio9;

import java.util.ArrayList;
import java.util.List;

import tp1.ejercicio8.Sequence;

public class Stack<T> extends Sequence {

	private List<T> data;
	
	public Stack () {
		data = new ArrayList<T>();
	}
	
	public void push (T data) {
		this.data.add(data);
	}
	
	public T pop () {
		return this.data.remove(data.size() -1);
	}
	
	public T top() {
		return this.data.get(data.size() - 1);
	}
	
	public int size() {
		return this.data.size();
	}

	@Override
	public boolean isEmpty() {
		return data.size() == 0;
	}
	
}
