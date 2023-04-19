package poo;

public class Carta {

	private String cara; // cara de la carta ("As", "Dos", ...)
	private String palo; // palo de la carta ("Corazones", "Diamantes", ...)
	 
	// el constructor de dos argumentos inicializa la cara y el palo de la carta
	public Carta( String caraCarta, String paloCarta )
	{
	 cara = caraCarta; // inicializa la cara de la carta
	 palo = paloCarta; // inicializa el palo de la carta
	 } // fin del constructor de Carta con dos argumentos
	 
	 // devuelve representación String de Carta
	 public String toString()
	 {
	 return cara + " de " + palo;
	 } // fin del método toString
	
}
