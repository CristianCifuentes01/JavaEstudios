package poo;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		
		
		
		Coche micoche1=new Coche();
		micoche1.establece_color("Rojo");
		Furgoneta mifurgoneta1=new Furgoneta(7,580);
		mifurgoneta1.establece_color("Azul");
		mifurgoneta1.configura_asientos("si");
		mifurgoneta1.configura_climatizador("si");
		
		System.out.println(micoche1.dime_datos_generales()
				+"\n"+micoche1.dime_color());
		
		System.out.println(mifurgoneta1.dime_datos_generales()
				+"\n"+mifurgoneta1.dimeDatosFurgoneta());
	}

}
