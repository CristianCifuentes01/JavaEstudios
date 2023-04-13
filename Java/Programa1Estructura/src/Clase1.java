import java.util.Scanner;	
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Clase1 {

	public static void main (String args[]) {
		Scanner entrada=new Scanner(System.in);
		
		
		/*String cadena=JOptionPane.showInputDialog("Escribe el radio del circulo ");
		//String nombre=entrada.nextLine();
		double rad=Double.parseDouble(cadena);
		double area=(Math.PI)*(Math.pow(rad,2));
		System.out.println("El área del circulo es: "+area);*/
		
		
		
		
		/*System.out.println("Escribe el numero de ventas a introducir: ");
		int numVen=entrada.nextInt();
		int sumaVen=0;
		for(int i=1;i<=numVen;i++) {
			System.out.println("Escribe el precio de la venta "+i+":");
			sumaVen+=entrada.nextInt();
		}
		System.out.println("El valor a total es: "+sumaVen);*/
		
		
		
		
		
		double resultado=0;
		double resultado2=0;
		boolean sigue;
		System.out.println("Escribe el valor de a: ");
		double a=entrada.nextDouble();	
		System.out.println("Escribe el valor de b: ");
		double b=entrada.nextDouble();	
		System.out.println("Escribe el valor de c: ");
		double c=entrada.nextDouble();	
		
		double discriminante=Math.sqrt(Math.pow(b,2)-(4*a*c));
		
		System.out.println(discriminante);
		if(discriminante<0) {
			System.out.println("No tiene solocion en los reales");
		}
		
		if(discriminante==0) {
			System.out.println("Tiene una unica solucion");
			
			resultado=((-b)/(2*a));
			
				System.out.println("Solucion "+ resultado);
	
		}
		if(discriminante>0) {
			System.out.println("Tiene dos soluciones");
			resultado=((-b)-Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
			resultado2=((-b)+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
			System.out.println("Solucion 1: "+ resultado);
			System.out.println("Solucion 2: "+ resultado2);
		}
		
		
		
		/*String contra="123hola";
		int intentos=0;
		while(intentos<3) {
			System.out.println("\nintento: "+(intentos+1));
			System.out.println("Escriba la contraseña: ");
			String c=entrada.next();
			
			if(c.equals(contra)) {
				intentos=3;
				System.out.println("En hora buena!!");
			}
			
			intentos++;
		}*/
		
		
		
		
		
		/*int continua=0;
		while(continua==0) {
			System.out.println("\nEscribe un numero");
			int numero=entrada.nextInt();
			continua=0;
			if(numero>=0) {
				System.out.println("el numero "+numero+" es mayo que 0");
				continua=1;
			}else {
				System.out.println("el numero "+numero+" no es mayor que 0");
			}
		}*/
		
		
		
		
		Random random=new Random();
		
		/*System.out.println("Escribe el primer numero:");
		int numero1=entrada.nextInt();
		System.out.println("Escribe el segundo numero: ");
		int numero2=entrada.nextInt();
		System.out.println();
		
		int mayor=0;
		int menor=0;
		if(numero1<numero2) {
			mayor=numero2;
			menor=numero1;
		}else if(numero1>numero2) {
			mayor=numero1;
			menor=numero2;
		}
		
		ArrayList<Integer> numDispo = new ArrayList<>();
		for(int i=menor;i<mayor;i++) {
			numDispo.add(i);
		}
		//int numRand=0;
		for(int i=0;i<5;i++) {
			int indiceAleatorio = random.nextInt(numDispo.size());
            int numeroAleatorio = numDispo.get(indiceAleatorio);
            numDispo.remove(indiceAleatorio);
            System.out.println(numeroAleatorio);		
        }*/
		
		
		
		
		
		 
		/*System.out.println("Escribe el primer numero:");
		int numero1=entrada.nextInt();
		System.out.println("Escribe el segundo numero: ");
		int numero2=entrada.nextInt();
		System.out.println();
		
		int mayor=0;
		int menor=0;
		if(numero1<numero2) {
			mayor=numero2;
			menor=numero1;
		}else if(numero1>numero2) {
			mayor=numero1;
			menor=numero2;
		}
		
		int numRand=0;
		for(int i=0;i<10;i++) {
			numRand=random.nextInt(mayor-menor+1)+menor;
			System.out.println(numRand);
		}*/
		
		
		
		
		/*
		System.out.println("Escribe un numero: ");
		String num=entrada.nextLine();
		String num2=num.replace(".","").replace(" ", "").replace(",", "");
		//CUENTA LA CANTIDAD DE CARACTERES SIN PUNTOS NI ESPACIOS
		int numCant=num2.length();
		System.out.println("El numero "+num+" tiene "
				+numCant+" caracteres");
		*/
		
	
		

		
		
		/*System.out.println("Escribe un numero: ");
		int num=entrada.nextInt();
		boolean valido;
		boolean primo=false;
		
		if(num<=1) {
			valido=false;
			System.out.println("El numero no es primo");
		}else {
			valido=true;
		}
		
		if(valido) {
			for(int i=2;i<Math.sqrt(num);i++) {
				if(num%i==0) {
					primo=true;
				}
			}
			
			
			if(primo) {
				System.out.println("El numero no es primo");
			}else {
				System.out.println("El numero es primo");
			}	
		}*/
		
		
		/*String cadena="La lluvia en Sevilla es una maravilla";
        int contador=0;
        for (int i=0;i<cadena.length();i++){
            //Comprobamos si el caracter es una vocal
            if(cadena.charAt(i)=='a' || 
                    cadena.charAt(i)=='e' || 
                    cadena.charAt(i)=='i' || 
                    cadena.charAt(i)=='o' || 
                    cadena.charAt(i)=='u'){
                contador++;
            }
        }
        System.out.println("Hay "+contador+" vocales");
		*/
		
		
		
		
	}
}

