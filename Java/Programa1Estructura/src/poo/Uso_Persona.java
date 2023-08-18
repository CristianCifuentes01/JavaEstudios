package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {

		Persona[]lasPersonas=new Persona[2];
		lasPersonas[0]=new empleado2("Luis Conde", 50000, 2009,02,25);
		lasPersonas[1]=new Alumno("Carlos ramirez","Ing. En Sistemas");
		
		for(Persona p: lasPersonas) {
			System.out.println(p.dameNombre()+", "+ p.dameDescripcion());
		}
	}

}


abstract class Persona{
	
	private String nombre;
	public Persona(String nom) {
		nombre=nom;
	}
	public String dameNombre() {
		return nombre;
	}
	
	public abstract String dameDescripcion();
	
}

class empleado2 extends Persona{
	
	private double sueldo;
	private Date altaContrato;
	private int Id=1;
	public empleado2(String nom, double sue, int year, int mes, int dia)//PRIMER CONSTRUCTOR 
	{
		super(nom);
		
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(year,mes-1,dia);
		altaContrato=calendario.getTime();
		
	}
	
	public String dameDescripcion() {
		return"Este empleado tiene un Id: "+Id+". Con salario: "+sueldo;
	}
	
	public double dameSueldo()//GETTER
	{
		return sueldo;
	}
	
	public Date dameFechaContrato() {//GETTER
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {//METODO SETTER
		double aumento=sueldo*(porcentaje/100);
		sueldo+=aumento;
	}
	public int dameId() {
		return Id;
	}
}

class Alumno extends Persona{
	private String carrera;
	
	public Alumno (String nom, String car) {
		super(nom);
		carrera=car;
	}
	public String dameDescripcion() {
		return "Ete alumno esta estudiando la carrera: "+carrera;
	}
}