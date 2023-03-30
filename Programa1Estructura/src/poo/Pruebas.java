package poo;

public class Pruebas {

	public static void main(String[] args) {
		

		Empleados trabajador1=new Empleados("Cristian");
		Empleados trabajador2=new Empleados("Andres");
		Empleados trabajador3=new Empleados("Antonio");
		Empleados trabajador4=new Empleados("Clara");
		
		trabajador2.cambiaSeccion("Recursos Humanos");
		
		
		System.out.println(trabajador1.devuelveDatos()+"\n"
		+trabajador2.devuelveDatos()+"\n"+trabajador3.devuelveDatos()+"\n"
		+trabajador4.devuelveDatos());
		System.out.println(Empleados.dameIdSguiente());
		
	}

	
}

class Empleados{
	
	
	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente=1;
	
	
	public Empleados(String nom) {//CONSTRUCTOR 
		nombre=nom;
		seccion = "Administracion";
		Id=IdSiguiente;
		IdSiguiente++;
	}
	
	
	public void cambiaSeccion(String seccion) {//METODO SETTER
		this.seccion=seccion;	
	}
	
	
	public String devuelveDatos() {//METODO GETTER
		return "El nombre es: "+nombre+ ". \nLa seccion es: "+seccion+" \nEl ID es: "+Id+"\n";
	}
	
	public static String dameIdSguiente() {
		return "El ID siguiente es: "+IdSiguiente;
	}
	
}