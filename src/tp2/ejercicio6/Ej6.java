package tp2.ejercicio6;

import tp2.ejercicio2.BinaryTree;

public class Ej6 {
	public static void main (String[] args) {
		
		BinaryTree<Integer> a1 = new BinaryTree<Integer>(1);
		
		a1.addLeftChild(new BinaryTree<Integer>(2));
		a1.getLeftChild().addRightChild(new BinaryTree<Integer>(4));
		a1.addRightChild(new BinaryTree<Integer>(3));
		a1.getRightChild().addLeftChild(new BinaryTree<Integer>(5));
		a1.getRightChild().getLeftChild().addLeftChild(new BinaryTree<Integer>(7));
		a1.getRightChild().getLeftChild().addRightChild(new BinaryTree<Integer>(8));
		a1.getRightChild().addRightChild(new BinaryTree<Integer>(6));
		
		Transformacion trans = new Transformacion();
		trans.setTree(a1);
		BinaryTree<Integer> a2=trans.suma();
		a2.imprimirPorNiveles();
	}
}
