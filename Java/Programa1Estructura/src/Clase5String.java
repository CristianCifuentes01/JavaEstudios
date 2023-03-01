
public class Clase5String {

	public static void main(String[] args) {
	
		String nombre="Cristian";
		System.out.println("Mi nombre es "+nombre);
		
		//Se utiliza .Lenngth para contar la cantidad de caracteries 
		System.out.println("El nombre tiene "+nombre.length()+" caracteres ");
		System.out.println("La primera letra del nombre es: "+nombre.charAt(0));
		int numLetra=nombre.length();
		System.out.println("La ultima letra del nombre es: "+nombre.charAt(numLetra-1));
		
		
		String frase="La noche era tenue todo cambio en aquel momento en el que el lo volvio a mirar";
		// .sbtring sirve para tomar partes de una cadena de caracteres
		String fraseR=frase.substring(0, 19)+"y ya era la vez en que se encontro asi mismo ";
		System.out.println(fraseR);
		
		
		
		String nom1="david",nom2="David";
		System.out.println(nom1.equals(nom2));
		//Ignora las masyusculas o minusculas
		System.out.println(nom1.equalsIgnoreCase(nom2));
	}
}
