package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		
		Jefatura jefe_RRHH=new Jefatura("Juan", 55000,2006,9,25);
		jefe_RRHH.estableceIncentivo(2570);
		
		
		Empleado[] misEmpleados=new Empleado[6];
		misEmpleados[0]=new Empleado("Cristian Cifeuntes",85000,1990,12,17);
		misEmpleados[1]=new Empleado("Andres Ruiz",94000,1995,06,02);
		misEmpleados[2]=new Empleado("Camilo Suarez",67000,1989,03,19);
		misEmpleados[3]=new Empleado("Antonio ");
		misEmpleados[4]=jefe_RRHH; //POLIMORFISMO
		misEmpleados[5]= new Jefatura("Maria",94000,1995,06,02);
		
		//CASTING (REFUNDICION DE OBJETOS)
		Jefatura jefe_Finanzas=(Jefatura)misEmpleados[5];
		jefe_Finanzas.estableceIncentivo(50000);
		
		for(Empleado e: misEmpleados) { //BUCLE FOR MEJORADO 
			e.subeSueldo(5);
		}
		
		/*for(int i=0; i<3;i++) {
			System.out.println( " Nombre: "+misEmpleados[i].dameNombre()
					+ " Saldo de cuenta: "+ misEmpleados[i].dameSueldo()
					+ " Fecha de Alta: "+ misEmpleados[i].dameFechaContrato());
		}*/
		for(Empleado e: misEmpleados) {  //BUCLE FOR MEJORADO
			System.out.println( "Nombre: "+e.dameNombre()
					+ " \nSaldo de cuenta: "+ e.dameSueldo()
					+ "\nFecha de Alta: "+ e.dameFechaContrato()+"\n");
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

//CLASE JEFATURA VA HA HEREDAR LOS ATRUBUTOS DE LA CLASE EMPLEADO 
class  Jefatura extends Empleado{
	
	public Jefatura(String nom, double sue, int year, int mes, int dia) {//CREACION DEL CONSTURCTOR
		super(nom, sue,year,mes,dia);
	}
	
	public void estableceIncentivo(double b) {//METODO SETTER
		incentivo=b;
	}
	
	public double dameSueldo() {//METODO GETTER
		double sueldoJefe=super.dameSueldo();
		return sueldoJefe+incentivo;
	}
	
	private double incentivo;
		
}


