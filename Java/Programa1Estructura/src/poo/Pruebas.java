package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados trabajador1=new Empleados("Cristian");
		Empleados trabajador2=new Empleados("Andres");
		
		
		
		trabajador2.cambiaSeccion("Recursos Humanos");
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
	}

	
}

class Empleados{
	
	private final String nombre;
	private String seccion;
	public Empleados(String nom) {//CONSTRUCTOR 
		nombre=nom;
		seccion = "Administración";
	}
	
	public void cambiaSeccion(String seccion) {//METODO SETTER
		this.seccion=seccion;
		
	}
	public String devuelveDatos() {//METODO GETTER
		return "El nombre es: "+nombre+ ". Seccion es: "+seccion;
	}
	
	
}