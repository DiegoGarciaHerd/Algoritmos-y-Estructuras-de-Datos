package tp1.ejercicio1;

public class Iterador {
	public static void iterarFor(int a, int b) {
		for(int i=a; i<=b; i++) {
			System.out.println(i);
		}
	}
	
	public static void iterarWhile(int a,int b) {
		int i=a;
		while(i>=a && i<=b) {
			System.out.println(i);
			
			i++;
	}
	}
	
	public static void iterarRecursion(int a,int b) {
		System.out.println(a);
		if(a<b) {
			iterarRecursion(a+1,b);
		}
	}
}
