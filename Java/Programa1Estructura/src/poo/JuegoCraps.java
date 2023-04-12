package poo;
import java.util.Random;
public class JuegoCraps {

	private Random numerosRan=new Random();	
	private enum Estado { CONTINUA, GANO, PERDIO }
	
	private final static int dos = 2;
	private final static int tres = 3;
	private final static int doce = 12;
	
	private final static int siete = 7;
	private final static int once= 11;
	
	public int tirarDados() {
		
		int dado1=numerosRan.nextInt(6)+1;
		int dado2=numerosRan.nextInt(6)+1;
		int suma=dado1+dado2;
		System.out.printf("Suma tiro jugado: %d + %d == %d\n",dado1,dado2,suma);
		return suma;
	}
	
	public void jugar (){
	
		int miPunto = 0;
		Estado estadoJuego;
		int sumaDeDados = tirarDados();
		
		switch(sumaDeDados){
			case siete:
			case once:
				estadoJuego=Estado.GANO;
			break;
			
			case dos:
			case tres:
			case doce:
				estadoJuego=Estado.PERDIO;
			break;
			
			default:
				estadoJuego=Estado.CONTINUA;
				
				miPunto=sumaDeDados;
				System.out.printf("El punto es %d\n\n",miPunto);
				System.out.println("Tiene otro intento...");
				break;			
				
		}
		while(estadoJuego==Estado.CONTINUA) {
			sumaDeDados=tirarDados();
			miPunto=sumaDeDados;
			System.out.printf("El punto es %d\n\n",miPunto);
			if(sumaDeDados!=siete) {
				System.out.println("Tiene otro intento...");
			}
			
			if(estadoJuego==Estado.GANO) {
				estadoJuego=Estado.GANO;
				
			}
			else if(sumaDeDados==siete) {
				estadoJuego=Estado.PERDIO;
			}
			
			
		}
		if(estadoJuego==Estado.GANO) {
			System.out.println("El jugador ha ganado");
		}
		else {
			System.out.println("El jugador ha perdido");
		}
		
		
	}
	
	
	
}

