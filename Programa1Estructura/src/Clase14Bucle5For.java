//Desarrolla el factorial de un numero 
import javax.swing.*;
public class Clase14Bucle5For {

	public static void main(String[] args) {
		Long resultado=1L;
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Escribe un número "));
		
		for(int i=numero;i>0;i--) {
			resultado=resultado*i;
		}
		System.out.println("El factorial del numero "+numero+" es: "+resultado);
	}

}
