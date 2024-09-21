package tp3.ejercicio1y3y5;

import java.util.LinkedList;
import java.util.List;

import tp2.ejercicio2.Queue;

public class GeneralTree<T>{

	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>(); 

	public GeneralTree() {
		
	}
	public GeneralTree(T data) {
		this.data = data;
	}

	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this(data);
		this.children = children;
	}	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}
	
	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null)
			this.children = children;
	}
	
	public void addChild(GeneralTree<T> child) {
		this.getChildren().add(child);
	}

	public boolean isLeaf() {
		return !this.hasChildren();
	}
	
	public boolean hasChildren() {
		return !this.children.isEmpty();
	}
	
	public boolean isEmpty() {
		return this.data == null && !this.hasChildren();
	}

	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren())
			children.remove(child);
	}

	/*devuelve la profundidad o nivel del dato en el árbol. El nivel de un nodo
 	es la longitud del único camino de la raíz al nodo.*/
	
	public int nivel(T dato){
		
		Queue<GeneralTree<T>> cola = new Queue();
		GeneralTree<T> aux;
		int nivel = 0;
		cola.enqueue(this);
		cola.enqueue(null);
		while(!cola.isEmpty()) {
			aux = cola.dequeue();
			if(aux.getData() != null) {
				if(aux == dato) {
					return nivel;	
				}
			
			for(GeneralTree<T> child:this.getChildren()) {
				cola.enqueue(child);
			}
			}
			else if(!cola.isEmpty()) {
				nivel++;
				cola.enqueue(null);
			}
		}
		
		return -1;
	  }
	/*la amplitud (ancho) de un árbol se define como la cantidad de nodos que
 	se encuentran en el nivel que posee la mayor cantidad de nodos.*/
	
	public int ancho(){
		Queue<GeneralTree<T>> cola = new Queue();
		GeneralTree<T> aux;
		int nivel = 0;
		cola.enqueue(this);
		cola.enqueue(null);
		while(!cola.isEmpty()) {
			aux = cola.dequeue();
			if(aux.getData() != null) {
				if(aux == dato) {
					return nivel;	
				}
			
			for(GeneralTree<T> child:this.getChildren()) {
				cola.enqueue(child);
			}
			}
			else if(!cola.isEmpty()) {
				nivel++;
				cola.enqueue(null);
			}
		return 0;
	}
	
	/*devuelve la altura del árbol, es decir, la longitud del camino más largo
 	desde el nodo raíz hasta una hoja.*/
	
	public int altura() {
		if(this.isLeaf()) {
			return 0;
		}
		
		int alturaMax = -1;
		List<GeneralTree<T>> children = this.getChildren();
		for(GeneralTree<T> child: children) {
			alturaMax= Math.max(alturaMax, child.altura());
		}
		return alturaMax +1;
			
	}
}