import java.util.Scanner;

public class Clase6EntradaDeDatos {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Escribe tu nombre: ");
		String NombreU=entrada.nextLine();
		System.out.println("Escribe tu edad: ");
		int EdadU;
		EdadU=entrada.nextInt();
		System.out.println("Tu nombre es "+NombreU+" y tienes "+EdadU+" años");
	}

}
