package tp2.ejercicio8;

import tp2.ejercicio1.BinaryTree;


public class Ej8 {
	public static void main(String [] args ) {
	BinaryTree<Integer> ab = new BinaryTree<Integer>(1);
	BinaryTree<Integer> hijoIzquierdo = new BinaryTree<Integer>(7);
	hijoIzquierdo.addLeftChild(new BinaryTree<Integer>(20));
	hijoIzquierdo.addRightChild(new BinaryTree<Integer>(18));
	BinaryTree<Integer> hijoDerecho= new BinaryTree<Integer>(9);
	ab.addLeftChild(hijoIzquierdo);
	ab.addRightChild(hijoDerecho);
	
	BinaryTree<Integer> ab1 = new BinaryTree<Integer>(1);
	BinaryTree<Integer> hijoIzquierdo1 = new BinaryTree<Integer>(7);
	BinaryTree<Integer> hijoDerecho1= new BinaryTree<Integer>(9);
	ab1.addLeftChild(hijoIzquierdo);
	ab1.addRightChild(hijoDerecho);
	
	System.out.println(ParcialArboles2.esPrefijo(ab,ab1));
	}
}
