package tp1.ejercicio2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int[] resultado = calcularMultiplos(s.nextInt());
		
		System.out.print("[");
		for(int i=0; i<resultado.length ; i++) {
			System.out.print(resultado[i]+" ");
		}
		System.out.print("]");
	
	}	
	
	
	public static int[] calcularMultiplos(int n ) {
		int[] arreglo=new int[n];
		for(int i=0; i<n; i++) {
			arreglo[i]= n *(i+1); 
		}
		return arreglo;
	}

}