package tp3.ejercicio2;

import java.util.LinkedList;
import java.util.List;

import tp2.ejercicio2.Queue;
import tp3.ejercicio1y3y5.*;
public class RecorridosAG {

	/*Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
 	pasados como parámetros, recorrido en preorden.*/
	
	public List<Integer> numerosImparesMayoresQuePreOrden (GeneralTree <Integer> a,Integer n){
		List<Integer> lis = new LinkedList<Integer>();
		this.preorder(lis,a,n);
		return lis;
	}
	
	private void preorder(List<Integer> l, GeneralTree<Integer> a, Integer n) {
		if(a.getData() % 2 == 0 && a.getData() > n) {
			l.add(a.getData());
		}
		List<GeneralTree<Integer>> children = a.getChildren();
		for( GeneralTree<Integer> child:children) {
			preorder(l,child,n);
		}
	}
	
	/* Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
 	pasados como parámetros, recorrido en inorden.*/
	
	public List<Integer> numerosImparesMayoresQueInOrden (GeneralTree <Integer> a, Integer n) {
		List<Integer> lis = new LinkedList<Integer>();
		this.preorder(lis,a,n);
		return lis;
	}
	
	private void inorden(List<Integer> l, GeneralTree<Integer> a, Integer n) {
		if(!a.isEmpty()) {
			int i=0;
			for(GeneralTree<Integer> child:a.getChildren()) {
				i++;
				inorden(l,child,n);
				if(i==1 && a.getData() % 2 == 0 && a.getData() > n) {
					l.add(a.getData());
				}
			}
			if (i==0 && a.getData() % 2 == 0 && a.getData() > n) {
				l.add(a.getData());
			}
		}
	}

	
	/* Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
 	pasados como parámetros, recorrido en postorden.*/

	public List<Integer> numerosImparesMayoresQuePostOrden (GeneralTree <Integer> a, Integer n){
		List<Integer> lis = new LinkedList<Integer>();
		this.preorder(lis, a, n);
		return lis;
	}
	
	public void posorden(List<Integer> l,GeneralTree<Integer> a, Integer n ) {
		if(!a.isEmpty()) {
			for(GeneralTree<Integer> child:a.getChildren()) {
				this.posorden(l, child, n);
				
			}
			if(a.getData() % 2 == 0 && a.getData() > n) {
				l.add(a.getData());
			}
			
		}
	}
	
	 public List<Integer> numerosImparesMayoresQuePorNiveles(GeneralTree <Integer> a, Integer n) {
		 List<Integer> lis = new LinkedList<Integer>();
		 this.porNiveles(lis, a, n);
		 return lis;
	 }
	 
	 public void porNiveles(List<Integer> l,GeneralTree<Integer> a, Integer n) {
		 
		 Queue<GeneralTree<Integer>> cola = new Queue();
		 cola.enqueue(a);
		 GeneralTree<Integer> aux;
		 while(!cola.isEmpty()) {
			 aux = cola.dequeue();
			 if ((aux.getData()>n) && a.getData() % 2 == 0) {
					l.add(aux.getData());
				}
			 for(GeneralTree<Integer> child:a.getChildren()) {
				 cola.enqueue(child);
			 }
			 
		 }
	 }
			 
		
	 
}