package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		/*Empleado empleado1=new Empleado("Cristian Cifeuntes",85000,1990,12,17);
		Empleado empleado2=new Empleado("Andres Ruiz",94000,1995,06,02);
		Empleado empleado3=new Empleado("Camilo Suarez",67000,1989,03,19);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("nombre: "+empleado1.dameNombre() + " Sueldo: "+empleado1.dameSueldo()
		+ " Fecha de Alta: " + empleado1.dameFechaContrato());
		*/
		
		Empleado[] misEmpleados=new Empleado[3];
		misEmpleados[0]=new Empleado("Cristian Cifeuntes",85000,1990,12,17);
		misEmpleados[1]=new Empleado("Andres Ruiz",94000,1995,06,02);
		misEmpleados[2]=new Empleado("Camilo Suarez",67000,1989,03,19);
		
		/*for(int i=0; i<3;i++) {
			misEmpleados[i].subeSueldo(5);
		}*/
		
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
	public Empleado(String nom, double sue, int year, int mes, int dia)
	{
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(year,mes-1,dia);
		altaContrato=calendario.getTime();
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
