package pooClase;

public class Card {

	private String face; // face of card ("Ace", "Deuce", ...)
	private String palo; // suit of card ("Hearts", "Diamonds", ...)

	   // two-argument constructor initializes card's face and suit
	public Card( String cardFace, String cardPalo )
	   {
	      face = cardFace; // initialize face of card
	      palo = cardPalo; // initialize suit of card
	   } // end two-argument Card constructor

	   // return String representation of Card
	public String toString() 
	   { 
	      return face + " of " + palo;
	   } // end method toString
	
}
