package poo;
import java.util.Random;
public class CartaPaquete {

	private Carta paquete[]; // arreglo de objetos Carta
	private int cartaActual; // subíndice de la siguiente Carta a repartir
	private final int NUMERO_DE_CARTAS = 52; // número constante de Cartas
	private Random numerosAleatorios; // generador de números aleatorios
	 
	 // el constructor llena el paquete de Cartas
	 public CartaPaquete()
	 {
	 String caras[] = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Joto", "Quina", "Rey" };
	 String palos[] = { "Corazones", "Diamantes", "Treboles", "Espadas" };
	 
	 paquete = new Carta[ NUMERO_DE_CARTAS ]; // crea arreglo de objetos Carta
	 cartaActual = 0; // establece cartaActual para que la primera Carta repartida sea paquete[ 0 ]
	 numerosAleatorios = new Random(); // crea generador de números aleatorios
	 
	 // llena el paquete con objetos Carta
	 for ( int cuenta = 0; cuenta < paquete.length; cuenta++ )
	 paquete[ cuenta ] =
	 new Carta( caras[ cuenta % 13 ], palos[ cuenta / 13 ] );
	 } // fin del constructor de PaqueteDeCartas
	
	  // baraja el paquete de Cartas con algoritmo de una pasada

	 public void barajar()
	 {
	  // después de barajar, la repartición debe empezar en paquete[ 0 ] otra vez
	 cartaActual = 0; // reinicializa cartaActual
	 
	  // para cada Carta, selecciona otra Carta aleatoria y las intercambia
	 for ( int primera = 0; primera < paquete.length; primera++ )
	 {
	 // selecciona un número aleatorio entre 0 y 51
	 int segunda = numerosAleatorios.nextInt( NUMERO_DE_CARTAS );
	 
	 // intercambia Carta actual con la Carta seleccionada al azar
	 Carta temp = paquete[ primera ];
	 paquete[ primera ] = paquete[ segunda ];
	 paquete[ segunda ] = temp;
	 } // fin de for
	 } // fin de método barajar
	 
	 // reparte una Carta
	 public Carta repartirCarta()
	 {
	 // determina si quedan Cartas por repartir
	 if ( cartaActual < paquete.length )
	 return paquete[ cartaActual++ ]; // devuelve la Carta actual en el arreglo
	 else
	 return null; // devuelve null para indicar que se repartieron todas las Cartas
	 } // fin del método repartirCarta
	
}

