package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		
		Jefatura jefe_RRHH=new Jefatura("Juan", 55000,2006,9,25);
		jefe_RRHH.estableceIncentivo(2570);
		
		
		Empleado[] misEmpleados=new Empleado[5];
		misEmpleados[0]=new Empleado("Cristian Cifeuntes",85000,1990,12,17);
		misEmpleados[1]=new Empleado("Andres Ruiz",94000,1995,06,02);
		misEmpleados[2]=new Empleado("Camilo Suarez",67000,1989,03,19);
		misEmpleados[3]=jefe_RRHH; //POLIMORFISMO
		misEmpleados[4]= new Jefatura("Maria",94000,1995,06,02);
		
		//CASTING (REFUNDICION DE OBJETOS)
		Jefatura jefe_Finanzas=(Jefatura)misEmpleados[4];
		jefe_Finanzas.estableceIncentivo(50000);
		
		
		System.out.println(jefe_Finanzas.tomar_decision("Dar mas dias de vacacion"));
		
		System.out.println("El jefe "+jefe_Finanzas.dameNombre()+" tiene un bonus de: "
				+jefe_Finanzas.establece_bonus(500));
		
		System.out.println("El Empleado "+misEmpleados[0].dameNombre()+" tiene un bonus de: "
				+misEmpleados[0].establece_bonus(200)+"\n");
		
		for(Empleado e: misEmpleados) { //BUCLE FOR MEJORADO 
			e.subeSueldo(5);
		}
		
		
		
		Arrays.sort(misEmpleados);//ORGANIZA EL ARREGLO SEGUN SU SUELDO
		
		for(Empleado e: misEmpleados) {  //BUCLE FOR MEJORADO
			System.out.println( "Nombre: "+e.dameNombre()
					+ " \nSaldo de cuenta: "+ e.dameSueldo()
					+ "\nFecha de Alta: "+ e.dameFechaContrato()+"\n");
		}


	}

}
class Empleado implements Comparable, Trabajadores{
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
	public int compareTo(Object miObjeto) {      // COMPRARA LOS SALARIOS CON LA INTERFAZ COMPRARETO
		Empleado otroEmpleado=(Empleado) miObjeto;
		if(this.sueldo<otroEmpleado.sueldo) {
			return -1;
		}
		if(this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}
		return 0;
	}
	
	public double establece_bonus(double gratificacion) {
		return Trabajadores.bonus_base+gratificacion;
	}
	
}



//CLASE JEFATURA VA HA HEREDAR LOS ATRUBUTOS DE LA CLASE EMPLEADO 
class   Jefatura extends Empleado implements Jefes{
	
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
	public String tomar_decision(String decision) {
		return"Un miembro de la direccion ha decidio:  "+decision;
	}
	public double establece_bonus(double gratificacion) {
		double prima= 2000;
		return Trabajadores.bonus_base+gratificacion+prima;
	}
	
	private double incentivo;
		
	
}


