package tp1.ejercicio9;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestBalanceo {
	
	public static boolean esBalanceado(String str) {
		List<Character> cierre=new LinkedList<Character>();
		cierre.add(')');
		cierre.add(']');
		cierre.add('}');
		
		
		if(( str.length() % 2 != 0) || (cierre.contains(str.charAt(0)))){
			return false;
		}
		else {
			Stack<Character> stack = new Stack<Character>();
			List<Character> apertura=new LinkedList<Character>();
			apertura.add('(');
			apertura.add('[');
			apertura.add('{');
			char car,elem;
			for (int i=0; i< str.length() ; i++) {
				car = str.charAt(i);
				if(apertura.contains(car)) {
					stack.push(car);
				} else if (!stack.isEmpty()) {
					elem = stack.pop();
					if ( cierre.indexOf(car) != apertura.indexOf(elem)) return false; // Quiere decir que si el ultimo elemento de la pila tiene 
																						//que coincidir con el nuevo elemento de cierre que se agregue
				}
				else 
					return false; // Quiere decir que se esta agregando un elemento de cierre en una pila vacia
			}
			return stack.isEmpty();
		}
		
	}
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese los caracteres ()[]{} en el orden que desee : ");
		String str = s.next();
		s.close();
  
        if (esBalanceado(str))
            System.out.println("Esta balanceada");
        else 
        	System.out.println("No esta balanceada" );
    }
}
