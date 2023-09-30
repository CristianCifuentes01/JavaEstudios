package Condicionales;


	public class MyClass {
	    public static void main(String args[]) {
	        // Implementar la funcionalidad deseada.
	        listaSimple<String> lista = new listaSimple<String>();
	        listaSimple<Integer> listaI = new listaSimple<Integer>(); 
	        lista.listar();
	        lista.insertarFinal("HOLA");
	        lista.insertarPrimero("Hola");
	        lista.insertarPrimero("Chau");
	        lista.listar();
	        lista.borrar("HOLa");
	        lista.listar();
	        System.out.println("--------------");
	        listaI.listar();
	        listaI.insertarFinal(1);
	        listaI.insertarPrimero(2);
	        listaI.insertarPrimero(2);
	        listaI.insertarPrimero(3);
	        listaI.insertarPrimero(3);
	        listaI.insertarFinal(3);
	        listaI.listar();
	        listaI.borrarTodo(3);
	        listaI.borrarTodo(3);
	        System.out.println("--------------");
	        listaI.listar();
	    }
	}
	
	
	class Nodo<T>{
	    private T elemento;
	    private Nodo<T> siguiente;
	
	public Nodo (T elem, Nodo sig){
	    elemento = elem;
	    siguiente = sig;
	}
	public T getElemento(){
	    return elemento;
	}
	public Nodo<T> getSig(){
	    return siguiente;
	}
	public void setElemento(T elem){
	    elemento = elem;
	}
	public void setSig(Nodo<T> sig){
	    siguiente = sig;
	}
	 
	}
	// Fin de la clase Nodo
	
	class listaSimple<T>{
	    private Nodo<T> primero;
	    private int numElem; 
	public listaSimple(){ 
	    primero = null;
	    numElem = 0;
	}
	
	public void insertarPrimero (T elemento){
	    Nodo nuevo = new Nodo (elemento, primero);
	    primero = nuevo;
	    numElem++;
	}
	
	public void insertarFinal (T elemento){ 
	    Nodo nuevo = new Nodo(elemento, null);
	    if (primero == null){
	    primero = nuevo;
	    }
	    else {
	        Nodo actual = primero;
	        while (actual.getSig()!= null){
	            actual = actual.getSig();
	            
	        }
	        actual.setSig(nuevo);
	        numElem++;
	    }
	//System.out.println("Final");
	}
	public void borrar (T elem){
	    if (primero == null) 
	        System.out.println("lista vacia");
	    else
	        if (primero.getElemento()== elem){
	        primero = primero.getSig();
	        numElem--;
	        }
	        else {
	            Nodo actual = primero;
	            while (actual.getSig()!=null && actual.getSig().getElemento() != elem)
	                actual = actual.getSig();
	                if (actual.getSig()== null )
	                    System.out.println ("elemento "+elem+" no esta en la lista");
	                else{
	                    actual.setSig(actual.getSig().getSig());
	                    numElem--;
	                }
	        }
	} 
	
	public void borrarTodo (T elem){
	    if (primero == null) 
	        System.out.println("lista vacia");
	    else
	        if (primero.getElemento()== elem){
	        primero = primero.getSig();
	        numElem--;
	        //}
	        //else {
	            Nodo actual = primero;
	            while (actual.getSig()!=null) {
	                actual = actual.getSig();
	                if (actual.getSig()== null )
	                    System.out.println ("elemento "+elem+" no esta en la lista");
	                else{
	                    if (actual.getSig().getElemento() == elem) {
	                        actual.setSig(actual.getSig().getSig());
	                        numElem--;
	                    }
	                }
	            }
	        }
	}
	
	public void listar(){
	    
	    Nodo<T> actual = primero;
	    if (primero==null) System.out.println("Lista vacia.");
	    else {
	    while (actual.getSig()!= null){
	        System.out.println(actual.getElemento());
	        actual = actual.getSig();
	    
	    }
	    System.out.println(actual.getElemento());
	    }
	}
	}
	//Fin de la clase Lista