package tp2.ejercicio6;

import tp2.ejercicio2.BinaryTree;

public class Transformacion {
	private BinaryTree<Integer> arbol;
	
	public BinaryTree<Integer> getTree () {
		return this.arbol;
	}
	public void setTree (BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	private int suma (BinaryTree<Integer> arbol) {
		int sum=0;
		
		
		if(arbol.isLeaf()) {
			sum= arbol.getData();
			arbol.setData(0);
			return sum;
		}
		
		if(arbol.hasLeftChild()) {
			sum+= this.suma(arbol.getLeftChild()); 		
			
		}
		
		if(arbol.hasRightChild()) {
			sum+= this.suma(arbol.getRightChild());
			
		}
		int aux= arbol.getData();
		arbol.setData(sum);
		return sum+aux;
		
	}
	
	public BinaryTree<Integer> suma() {
		suma(this.arbol);
		return this.arbol;
	}
}
