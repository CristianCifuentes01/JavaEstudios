package ListasEnlazadas;

public class Main {

	public static void main(String[] args) {
		
		ListaEnlazada lista =new ListaEnlazada();
		
		System.out.println(" La lista esta vacia:  "+lista.listaVacia());
		
		lista.addPrimero("Cristian");
		lista.addPrimero(23);
		lista.addPrimero(" Como vas? ");
		lista.addPrimero( 5);
		
		System.out.println(" Primer elemento de la lista:  "+lista.obtenerP(0));
		System.out.println(" Ultimo elemento de la lista:  "+lista.obtenerP(lista.tam-1));
		
		System.out.println(" Elemento en la posicion 2 :  "+lista.obtenerP(2));
		
		System.out.println(" La lista esta vacia:  "+lista.listaVacia()); 
		
		System.out.println(" Tamaño de la lista:  "+lista.tam);

	}

}
