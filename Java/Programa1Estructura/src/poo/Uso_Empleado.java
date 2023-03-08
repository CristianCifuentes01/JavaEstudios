package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		
		
		Empleado[] misEmpleados=new Empleado[4];
		misEmpleados[0]=new Empleado("Cristian Cifeuntes",85000,1990,12,17);
		misEmpleados[1]=new Empleado("Andres Ruiz",94000,1995,06,02);
		misEmpleados[2]=new Empleado("Camilo Suarez",67000,1989,03,19);
		misEmpleados[3]=new Empleado("Antonio ");
		
		
		for(Empleado e: misEmpleados) { //BUCLE FOR MEJORADO 
			e.subeSueldo(5);
		}
		
		/*for(int i=0; i<3;i++) {
			System.out.println( " Nombre: "+misEmpleados[i].dameNombre()
					+ " Saldo de cuenta: "+ misEmpleados[i].dameSueldo()
					+ " Fecha de Alta: "+ misEmpleados[i].dameFechaContrato());
		}*/
		for(Empleado e: misEmpleados) {  //BUCLE FOR MEJORADO
			System.out.println( " Nombre: "+e.dameNombre()
					+ " Saldo de cuenta: "+ e.dameSueldo()
					+ " Fecha de Alta: "+ e.dameFechaContrato());
		}


	}

}
class Empleado{
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	public Empleado(String nom, double sue, int year, int mes, int dia)//PRIMER CONSTRUCTOR 
	{
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(year,mes-1,dia);
		altaContrato=calendario.getTime();
	}
	public Empleado(String nom) {// SEGUNDO CONSTRUCTOR
		this(nom,30000,2000,01,02);
	}
	
	public String dameNombre() {//METODO GETTER
		return nombre;
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
	
}
