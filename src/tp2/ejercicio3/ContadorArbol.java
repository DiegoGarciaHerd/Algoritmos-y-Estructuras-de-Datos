package tp2.ejercicio3;

import java.util.LinkedList;
import tp1.ejercicio8.Queue;

import tp2.ejercicio2.BinaryTree;

public class ContadorArbol {
	BinaryTree<Integer> ab = new BinaryTree<Integer>();
	
	public ContadorArbol(BinaryTree<Integer> ab ) {
		this.ab = ab;
	}
	
	public LinkedList<Integer> numerosParesPreorden() {
		LinkedList<Integer> listaPreorden = new LinkedList<Integer>();
		if(!ab.isEmpty()) recorrerPreorden(listaPreorden,ab);
		return listaPreorden;
	}
	
	private void recorrerPreorden(LinkedList<Integer> l , BinaryTree<Integer> a){
		if(  a.getData() % 2 == 0) {
			l.add(a.getData());
		}
		
		if(a.hasLeftChild()) this.recorrerPreorden(l, a.getLeftChild());
		if(a.hasRightChild()) this.recorrerPreorden(l, a.getRightChild());
		
	}
	
	public LinkedList<Integer> numerosParesInorden() {
		LinkedList<Integer> listaInorden = new LinkedList<Integer>();
		if(!ab.isEmpty()) recorrerInorden(listaInorden,ab);
		return listaInorden;
	}
	
	private void recorrerInorden(LinkedList<Integer> l , BinaryTree<Integer> a){
		if(a.hasLeftChild()) this.recorrerPreorden(l, a.getLeftChild());
		if( a.getData() % 2 == 0) {
			l.add(a.getData());
		}
		if(a.hasRightChild()) this.recorrerPreorden(l, a.getRightChild());
	}
	
	public void printLevelTraversal() {
        BinaryTree<Integer> a = null;
        Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
        cola.enqueue(ab);
        cola.enqueue(null);
        while (!cola.isEmpty()) {
            a = cola.dequeue();
            if (a != null) {
                System.out.print(a.getData() + " | ");
                if (a.hasLeftChild()) {
                    cola.enqueue(a.getLeftChild());
                }
                if (a.hasRightChild()) {
                    cola.enqueue(a.getRightChild());
                }
            } else if (!cola.isEmpty()) {
                System.out.println();
                cola.enqueue(null);
            }
        }
 }
	// ***********************************************************************///
	
	public static void main (String[] args) {
		
        BinaryTree<Integer> ab = new BinaryTree<Integer>(4);
        ab.addLeftChild(new BinaryTree<Integer>(1));
        ab.addRightChild(new BinaryTree<Integer>(2));
        ab.getLeftChild().addLeftChild(new BinaryTree<Integer>(6));
        ab.getLeftChild().addRightChild(new BinaryTree<Integer>(5));
        ab.getRightChild().addLeftChild(new BinaryTree<Integer>(14));
        ab.getRightChild().addRightChild(new BinaryTree<Integer>(8));
        
        ContadorArbol contador = new ContadorArbol(ab);
        System.out.println("Imprimir por niveles:");
        contador.printLevelTraversal();
        LinkedList<Integer> listaPre = contador.numerosParesPreorden();
        LinkedList<Integer> listaIn = contador.numerosParesInorden();
        
        System.out.println("Los nodos pares del arbol en PREORDEN son: ");
        System.out.println(listaPre);
        System.out.println("Los nodos pares del arbol en INORDER son: ");
        System.out.println(listaIn);
        
        
		
	}
}
