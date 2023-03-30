import java.util.*;
import javax.swing.*;

public class Clase9Condicional2 {
	
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Elige una opción: \n1)Cuadrado\n2)Rectangulo\n3)Triangulo\n4)Circulo");
		int numfigura=entrada.nextInt();
		switch(numfigura) {
		case 1:
		{
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Intruduce el lado del cuadrado "));
			System.out.println("El area del cuadrado es "+Math.pow(lado, 2));
		}break;
		
		case 2:
		{
			int Base=Integer.parseInt(JOptionPane.showInputDialog("Intruduce la base del rectangulo "));
			int Altura=Integer.parseInt(JOptionPane.showInputDialog("Intruduce la altura del rectangulo "));
			System.out.println("El área del rectangulo es "+Base*Altura);
		}break;
		case 3:
		{
			int Base=Integer.parseInt(JOptionPane.showInputDialog("Intruduce la base del Triangulo "));
			int Altura=Integer.parseInt(JOptionPane.showInputDialog("Intruduce la altura del Triangulo "));
			System.out.println("El área del Triangulo es "+(Base*Altura)/2);
		}break;
		case 4:
		{
			int Radio=Integer.parseInt(JOptionPane.showInputDialog("Intruduce el radio del Circulo "));
			
			System.out.print("El área del circulo es ");
			System.out.printf("%1.2f", Math.PI*(Math.pow(Radio, 2)));
		}break;
		default:
			System.out.println("¡La opción no es correcta!");
		}
	} 

}
