package ListasEnlazadas;

public class ListaEnlazada {

	Nodo cabeza;
	int tam;
	
	public ListaEnlazada() {
		this.cabeza=null; 	
		this.tam=0;
	}
	
	public void addPrimero(Object obj) {
		if(cabeza==null) {
			cabeza=new Nodo(obj);
		}
		else {
			 Nodo temp =cabeza;
			 Nodo nuevo =new Nodo(obj);
			 nuevo.enlazarSiguente(temp);
			 cabeza=nuevo;
		}
		tam++;
		
	}
	
	public Object obtenerP (int posicion) {
		int contador=0;
		Nodo temporal=cabeza;
		while(contador<posicion) {
			temporal=temporal.obtenerSiguiente();
			contador++;
			
		}
		return temporal.obtenerValor();
	}
	
	public int obtenerTam() {
		return tam;
	}
	
	public boolean listaVacia() {
		return (cabeza==null)?true:false;
	}
	public void eliminarElemento() {
		cabeza = cabeza.obtenerSiguiente();
		tam--;
	}
	
	public void eliminarPosicion(int posicion) {
		if (posicion==0) {
			cabeza=cabeza.obtenerSiguiente();
		}else {
				int contador=0;
			Nodo temporal=cabeza;
			while(contador < posicion-1) {
				temporal=temporal.obtenerSiguiente();
				contador++;
				
			}
			temporal.enlazarSiguente( temporal.obtenerSiguiente().obtenerSiguiente());
		}
		tam--;
	}
	
	public void cortarLista(int posicion) {
		int contador=0;
		Nodo temporal=cabeza;
		while(contador < posicion-1) {
			temporal=temporal.obtenerSiguiente();
			contador++;
			
		}
		temporal.enlazarSiguente(null);
		tam=posicion;
	}
	
	
}
