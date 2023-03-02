package prueba2;
import java.util.Scanner;
public class Calificaciones {

	public static void main(String[] args) {
		
		
		ListaCalificaciones misCalif=new ListaCalificaciones();
		Scanner entrada=new Scanner (System.in);
		System.out.println("Escriba el nombre del curso: ");
		
		String nombreCurso= entrada.nextLine();
		
		
		misCalif.mostrarMensaje(nombreCurso);
		
	}

}
