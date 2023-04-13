package poo;
import java.util.*;
public class Arreglos {
	
	public static void main(String args[]) {
	Scanner entrada=new Scanner(System.in);
	
	/*System.out.println("Escribe la cantidad de estudiantes: ");
	
	final int estudiante=entrada.nextInt();
	double notas[]=new double[estudiante];
	
	for(int i=0; i<notas.length;i++) {
		System.out.printf("Escribe La nota del estudiante %d\n",i+1);
		notas[i]=entrada.nextDouble();
	}
	double promedio=0;
	double suma=0;
	for(int i=0; i<notas.length;i++) {
		suma+=notas[i];
		
	}
		promedio=suma/estudiante;
		System.out.println(promedio);*/
	
	
		Random numerosAleatorios = new Random(); // generador de números aleatorios
		int frecuencia[] = new int[ 7 ]; // arreglo de contadores de frecuencia

		// tira el dado 6000 veces; usa el valor del dado como índice de frecuencia
	 	for ( int tiro = 1; tiro <= 6000; tiro++ ) {
	 		++frecuencia[ 1 + numerosAleatorios.nextInt( 6 ) ];
	 	}
	 	
	 	System.out.printf( " %s  %10s\n", "Cara", "Frecuencia" );
	  
	 	// imprime el valor de cada elemento del arreglo
	 	for ( int cara = 1; cara < frecuencia.length; cara++ ) {
	 		System.out.printf( "%4d%10d\n", cara, frecuencia[ cara ] );
	 	}
	 	
	 	

		
	}
}
