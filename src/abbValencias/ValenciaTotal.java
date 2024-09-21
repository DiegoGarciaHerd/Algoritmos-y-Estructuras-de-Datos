package abbValencias;

import tp2.ejercicio1.BinaryTree;

	public class ValenciaTotal {
		
	  private static BinaryTree<Integer> crearBinaryTree(int[] stream, int i) {
		 int dato = stream[i];
		 BinaryTree<Integer> ab = new BinaryTree<Integer>(dato);
		 if (2*i < stream.length)
			 ab.addLeftChild(crearBinaryTree(stream, 2*i));
		 if (2*i+1 < stream.length)
			 ab.addRightChild(crearBinaryTree(stream, 2*i+1));
		 return ab;
	  }
		
	public static int calcularValencia(BinaryTree<Integer> arbol) {
		 if (arbol.isLeaf())
			 return arbol.getData();
		 int suma = 0;
		 if (arbol.hasLeftChild()) {
			 suma = suma + calcularValencia(arbol.getLeftChild());
		 }
		 if (arbol.hasRightChild()) {
			 suma = suma + calcularValencia(arbol.getRightChild());
		 }
		 	return suma;
	  }
	}

