package tp1.ejercicio3;

public class Main {
	public static void main(String[]args) {
		Estudiante[] estudiantes=new Estudiante[2];
		
		Profesor[] profesores=new Profesor[3];
		
		estudiantes[1]=new Estudiante("Leo","Messi",10,"lio@gmail.com","Av32nro2222");
		estudiantes[0]=new Estudiante("Angel","Di Maria",11,"fideo@gmail.com","Rosario001");
		
		profesores[0]=new Profesor("Julian","Alvarez","julian@gmail.com","AyED","unlp");
		profesores[1]=new Profesor("Cuti","Romero","cuti@gmail.com","Mat3","unlp");
		profesores[2]=new Profesor("Rodrigo","De Paul","rodri@gmail.com","FOD","unlp");
		
		for(int i=0; i<2; i++) {
			System.out.println(estudiantes[i].tusDatos());
			
		}
		for(int j=0; j<3; j++) {
			System.out.println(profesores[j].tusDatos());
		}
	}
}
