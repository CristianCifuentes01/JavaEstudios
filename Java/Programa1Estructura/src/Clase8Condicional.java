import java.util.*;
public class Clase8Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Entrada=new Scanner (System.in);
		System.out.println("Ingresa tu edad");
		int edad=Entrada.nextInt();
		if(edad<18) {
			System.out.println("Eres adolecente. Tienes "+edad+(" años"));
			
		}
		else if(edad<40) {
			System.out.println("Eres joven. Tienes "+edad+(" años"));
		}
		else if(edad<65) {
			System.out.println("Eres maduro. Tienes "+edad+(" años"));
		}
		else {
			System.out.println("Cuidate abuelo ¡¡Tienes "+edad+(" años!!"));
		}
	}

}
