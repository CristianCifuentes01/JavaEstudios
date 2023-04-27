package poo;
import java.util.Scanner;
public class Parcial2 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Escribe la cantidad de numeros de a ingresar\n");
		int Cant=entrada.nextInt();
		int numeros[]=new int[Cant];
		
		for(int i=0;i<Cant;i++) {
			System.out.println("Escribe el numero "+(i+1)+": ");
			numeros[i]=entrada.nextInt();
			}
		System.out.println();
		int suma=0;
		int numeros2[]=new int[Cant+1];
	    int mayor=numeros[0];
	    int menor =numeros[0];
	    
		for(int i=0;i<Cant;i++) {
			suma+=numeros[i];
			
			if(numeros[i]>mayor) {
				System.out.println(numeros[i]);
				mayor=numeros[i];
			}
			if(numeros[i]<menor) {
				menor=numeros[i];
			}
			
		}
		
		double promedio=suma/Cant;
		System.out.println();
		System.out.println("El promedio de los numero ingresados es: "+promedio);
		System.out.println("El numero mayor es: "+mayor);
		System.out.println("El numero menor es: "+menor);
		
		
	}
	
	

}
