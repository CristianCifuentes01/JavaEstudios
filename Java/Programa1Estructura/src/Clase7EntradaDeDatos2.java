//import java.util.Scanner;
import javax.swing.*;
public class Clase7EntradaDeDatos2 {

	public static void main(String[] args) {
		
		String NombreU=JOptionPane.showInputDialog("Introduuce tu nombre ");
		String EdadU=JOptionPane.showInputDialog("Introduuce tu edad ");
		int edadUE=Integer.parseInt(EdadU);
		edadUE--;
		System.out.println("Hola tu nombre es "+ NombreU + " tienes "+edadUE+" años" );
		
	}
	
}
