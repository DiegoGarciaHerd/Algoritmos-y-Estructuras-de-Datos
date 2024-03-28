package tp1.ejercicio5;

public class Calculos {
	public static Resultados resultado;
	
	public static Resultados calculoA(int[] arreglo) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		double promedio;
		int suma=0;
		
		for(int i=0; i<arreglo.length ; i++) {
			if(max<arreglo[i]) {
				max=arreglo[i];
			}
			if(min>arreglo[i]) {
				min=arreglo[i];
			}
			suma+=arreglo[i];
		}
		
		Resultados resultado=new Resultados();
		resultado.setMax(max);
		resultado.setMin(min);
		promedio= suma / arreglo.length;
		resultado.setProm(promedio);
		return resultado;
	}
	
	public static void calculoB(int[] arreglo, Resultados resultado) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		double promedio;
		int suma=0;
		
		for(int i=0; i<arreglo.length ; i++) {
			if(max<arreglo[i]) {
				max=arreglo[i];
			}
			if(min>arreglo[i]) {
				min=arreglo[i];
			}
			suma+=arreglo[i];
		}
		
		resultado=new Resultados();
		resultado.setMax(max);
		resultado.setMin(min);
		promedio= suma / arreglo.length;
		resultado.setProm(promedio);

	}
	
	public static void calculoC(int[] arreglo) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		double promedio;
		int suma=0;
		
		for(int i=0; i<arreglo.length ; i++) {
			if(max<arreglo[i]) {
				max=arreglo[i];
			}
			if(min>arreglo[i]) {
				min=arreglo[i];
			}
			suma+=arreglo[i];
		}
		
		resultado=new Resultados();
		resultado.setMax(max);
		resultado.setMin(min);
		promedio = suma / arreglo.length;
		resultado.setProm(promedio);
		
	}
}
