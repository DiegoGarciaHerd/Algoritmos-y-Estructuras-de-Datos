package tp2.ejercicio5;

import tp2.ejercicio2.BinaryTree;
import tp1.ejercicio8.Queue;
import java.util.Scanner;
public class ProfundidadArbolBinario {
	BinaryTree<Integer> a ;
	
	public ProfundidadArbolBinario (BinaryTree<Integer> ab) {
		this.a = ab;
	}
	
	public int sumaElementosProfundidad(int p) {
		BinaryTree<Integer> ab = null;
		Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
		cola.enqueue(a);
		cola.enqueue(null);
		int nivel = 0;
		int suma= 0;
		while (!cola.isEmpty()) {
			ab = cola.dequeue();
			
			if (ab != null) {
				if(nivel == p) suma += ab.getData();
			
				if (ab.hasLeftChild()) cola.enqueue(ab.getLeftChild());
				if(ab.hasRightChild()) cola.enqueue(ab.getRightChild());
			}
			else if (!cola.isEmpty()) {
				cola.enqueue(null);
				nivel++;
			}
			
		}
		
		return suma;
	}
	
	public static void main (String[] args) { 
		 BinaryTree<Integer> ab = new BinaryTree<Integer>(4);
	     ab.addLeftChild(new BinaryTree<Integer>(1));
	     ab.addRightChild(new BinaryTree<Integer>(6));
	     ab.getLeftChild().addLeftChild(new BinaryTree<Integer>(4));
	     ab.getLeftChild().addRightChild(new BinaryTree<Integer>(3));
	     ab.getRightChild().addLeftChild(new BinaryTree<Integer>(15));
	     ab.getRightChild().addRightChild(new BinaryTree<Integer>(8));
	     
	     ab.printLevelTraversal();
	     
	     System.out.println( "Ingrese la profundidad del arbol a sumar ");
	     Scanner scanner = new Scanner(System.in);
	     int prof = scanner.nextInt();
	     ProfundidadArbolBinario p = new ProfundidadArbolBinario(ab);
	     System.out.println("La suma de los elementos es " + p.sumaElementosProfundidad(prof));     
	     
	}
}
