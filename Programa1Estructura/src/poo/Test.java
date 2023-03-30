package poo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta01=new Cuenta();
		cuenta01.asignarNombre("Cristian Cifuentes");
		cuenta01.aisgnarCuenta("Cuenta de Ahorros");
		cuenta01.asignarTipoDeInteres(2.5);
		
		cuenta01.ingreso(12000);
		cuenta01.reintegro(3000);
		
		System.out.println(cuenta01.obtenerNombre());
		System.out.println(cuenta01.obtenercuenta());
		System.out.println("Estado de cuenta: "+cuenta01.estado());
		System.out.println("Tipo de interes: "+cuenta01.obtenerTipoDeInteres()+"%");
	}

}

