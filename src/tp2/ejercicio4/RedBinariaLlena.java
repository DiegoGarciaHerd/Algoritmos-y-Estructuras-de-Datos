package tp2.ejercicio4;

import tp2.ejercicio1.BinaryTree;

public class RedBinariaLlena {
	
	/* Voy comparando entre las 2 hojas , se obtiene el primer maximo y luego voy comparando el maximo de ese con las demas rams del arbol */
		private int retardoReenvio(BinaryTree<Integer> ab) {
			if (ab.isLeaf()) {
				return ab.getData();
			}
				int l = 0;
				int r = 0;
			if (ab.hasLeftChild()) {
				l = retardoReenvio(ab.getLeftChild());
			}
			if (ab.hasRightChild()) {
				r = retardoReenvio(ab.getRightChild());
			}
			if (l>r) {
				return ab.getData()+l;
			} else {
				return ab.getData()+r;
			}
		}
		
	}
}
