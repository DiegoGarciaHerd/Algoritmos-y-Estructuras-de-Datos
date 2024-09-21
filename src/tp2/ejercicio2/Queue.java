package tp2.ejercicio2;

import java.util.*;

public class Queue<T> extends Sequence {
	protected List<T> data;
	
	public Queue() {
		data = new LinkedList<T>();
	}
	
	public void enqueue(T dato) {
		data.add(dato); // Agrega dato al final de la lista 
	}
	
	public T dequeue() {
		return data.remove(0); // Elimina el primer elemento de la lista FIFO
	}
	
	public T head() {
		return data.get(0); // Retorna el primer elemento la lista
	}
	
	@Override
	public int size() {
		return data.size(); // Retorna el tamaño de la lista
	}
	
	@Override
	public boolean isEmpty() {
		return data.isEmpty(); // Retorna si la lista esta vacia
	}
	
	@Override
	public String toString() {
		String str = "[";
		for(T d: data)
			str = str + d +", ";
		str = str.substring(0, str.length()-2)+"]";
		return str;
		}
}
