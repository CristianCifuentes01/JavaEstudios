import java.util.*;
public class Clase11Bucle2Juego {

	public static void main(String[] args) {
		int aleatorio=(int)(Math.random()*10);
		Scanner entrada=new Scanner(System.in);
		int numero =-1,intentos=0;
		while(numero!=aleatorio) {
			intentos++;
			System.out.println("introduce un numero un numero entre 0 y 10");
			numero =entrada.nextInt();
			if(aleatorio<numero) {
				System.out.println("El numero es más bajo\n");
				
			}
			else if(aleatorio>numero){
				System.out.println("El numero es más alto\n");
			}
		}
		System.out.println("¡Correcto! Lo has conseguido en "+(intentos)+" intentos");
		
	}

}
