package poo;
import javax.swing.*;
public class Uso_Coche {

	public static void main(String[] args) {
		
		Coche Mustan=new Coche(); //INTANCIAR UNA CLASE
		
		Mustan.establece_color(JOptionPane.showInputDialog("introduce el color del coche"));
		
		System.out.println(Mustan.dime_datos_generales());
		System.out.println(Mustan.dime_color());
		
		
		Mustan.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?(si/no)"));
		System.out.println(Mustan.dime_asientos_cuero());
		
		Mustan.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?(si/no)"));
		System.out.println(Mustan.dime_climatizador());
		
		System.out.println(Mustan.dime_peso_coche());
		System.out.println("El precio final del coche es: "+Mustan.precio_coche()+" Euros");
	}

}
