package tp2.ejercicio7;

import tp2.ejercicio1.BinaryTree;

public class ParcialArboles {
	private BinaryTree<Integer> arbol;
	
	public BinaryTree<Integer> search(BinaryTree<Integer> tree,int n){

		if (tree.getData()==n) {
			return tree;
		} 
		
		BinaryTree<Integer> ret = null;
		if (tree.hasLeftChild()) {
			ret = search(tree.getLeftChild(), n);
		}
		if ((tree.hasRightChild()) && (ret==null)) {
			ret = search(tree.getRightChild(), n);
		}
		return ret;
		
		
	}
	
	public int contarUnicos(BinaryTree<Integer> arbol) {
		int count=0;
		if(this.arbol.hasLeftChild()) {
			count+=this.contarUnicos(this.getArbol().getLeftChild());
		}
		if(this.arbol.hasRightChild()) {
			count+=this.contarUnicos(arbol.getRightChild());
		}
		if(this.arbol.hasRightChild() ^ this.arbol.hasLeftChild()) {
			count++;
		}
		
		return count;
	}
	
	public boolean isLeftTree(BinaryTree<Integer> arbol) {
		
		int izq=-1;
		int der=-1;
		
		if(this.arbol.hasLeftChild()) {
			izq = contarUnicos(this.arbol.getLeftChild());
		}
		
		if(this.arbol.hasRightChild()) {
			der = contarUnicos(this.arbol.getRightChild());
		}
		
		if( der < izq ) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isLeftTree(int num) {
		BinaryTree<Integer> tree = search(this.getArbol(), num);
		if (tree==null) {
			return false;
		} else {
			return isLeftTree(tree);
		}
	}

	private BinaryTree<Integer> getArbol() {
		// TODO Auto-generated method stub
		return this.arbol;
	}
}
