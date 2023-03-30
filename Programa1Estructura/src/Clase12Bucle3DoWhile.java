import javax.swing.*;
public class Clase12Bucle3DoWhile {
	public static void main(String[] args) {
		String genero="";
		do {
			genero=JOptionPane.showInputDialog("Intruduce tu genero (F/M)");
		}while(genero.equalsIgnoreCase("M")==false && genero.equalsIgnoreCase("F")==false); 
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Escribe tu altura en Cm"));
		int pesoIdeal=0;
		if(genero.equalsIgnoreCase("M")) {
			pesoIdeal=altura-110;
		
		}
		else if(genero.equalsIgnoreCase("F")) {
			pesoIdeal=altura-120;
		}
		System.out.println("Su peso ideal es "+pesoIdeal+"Kg");
	}
}
