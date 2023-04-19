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
	
	
		/*Random numerosAleatorios = new Random(); // generador de números aleatorios
		int frecuencia[] = new int[ 7 ]; // arreglo de contadores de frecuencia

		// tira el dado 6000 veces; usa el valor del dado como índice de frecuencia
	 	for ( int tiro = 1; tiro <= 6000; tiro++ ) {
	 		++frecuencia[ 1 + numerosAleatorios.nextInt( 6 ) ];
	 	}
	 	
	 	System.out.printf( " %s  %10s\n", "Cara", "Frecuencia" );
	  
	 	// imprime el valor de cada elemento del arreglo
	 	for ( int cara = 1; cara < frecuencia.length; cara++ ) {
	 		System.out.printf( "%4d%10d\n", cara, frecuencia[ cara ] );
	 	}*/
	 	
	int arreglo[] = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };
	 
	  System.out.println( "Distribucion de calificaciones:" );
	 
	  // para cada elemento del arreglo, imprime una barra del gráfico
	 for ( int contador = 0; contador < arreglo.length; contador++ )
	 {
	  // imprime etiqueta de la barra ( "00-09: ", ..., "90-99: ", "100: " )
	  if ( contador == 10 )
	  System.out.printf( "%5d: ", 100 );
	  else
	  System.out.printf( "%02d-%02d: ",contador * 10, contador * 10 + 9 );
	 
	  // imprime barra de asteriscos
	  for ( int estrellas = 0; estrellas < arreglo[ contador ]; estrellas++ ) {
		  System.out.print( "*" );
	  }
	  
	
	  System.out.println(); // inicia una nueva línea de salida
	  } // fin de for externo
	
	

		
	}
}
