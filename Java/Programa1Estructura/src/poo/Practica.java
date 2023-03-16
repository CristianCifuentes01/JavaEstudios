package poo;

//import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Practica {
	public static void main (String [] args)  throws InterruptedException {
		/*int contador =2;
		do {
			System.out.println(contador);
			contador=contador+2;
		}while(contador<100);*/
		
		
		/*for (int i=19;i>=1;i-- ) {
			if(i%2==1) {
				System.out.println(i);
			}	
		}*/
		
		/*Scanner scanner =new Scanner(System.in);
		System.out.println("Escribe la cantidad de numero que quieres ingresar:");
		int numero=scanner.nextInt();
		int [] numeros=new int[numero];
		
		
		for(int i=0;i<numero;i++) {
			System.out.printf("Escribe el el dato #%d:  ",i+1);
			numeros[i]=scanner.nextInt();
		}
		int numMenor=numeros[0];
		for(int i=0;i<numero;i++) {
			
			if(numeros[i]<numMenor) {
				numMenor=numeros[i];
			}
		}
		System.out.println("El numero menor de los datos es: "+numMenor);*/
		
		
		
		
		/*for(int i=1;i<=5;i++) {
			int factorial=1;
			
			for(int j=2;j<=i;j++) {
				factorial=factorial*j;
			}
			System.out.printf("El factorial de %d es igual a %d\n",i,factorial);
		}*/
		
		
		
		/*Scanner scanner = new Scanner(System.in);
        double precio1 = 2.98;
        double precio2 = 4.50;
        double precio3 = 9.98;
        double precio4 = 4.49;
        double precio5 = 6.87;
        double total = 0.0;
        boolean seguir = true;
        while (seguir) {
            System.out.print("Ingrese el número del producto (1-5) o 0 para terminar: ");
            int producto = scanner.nextInt();
            if (producto == 0) {
                seguir = false;
            } else if (producto < 1 || producto > 5) {
                System.out.println("Número de producto inválido.");
            } else {
                System.out.print("Ingrese la cantidad vendida: ");
                int cantidad = scanner.nextInt();
                switch (producto) {
                    case 1:
                        total += precio1 * cantidad;
                        break;
                    case 2:
                        total += precio2 * cantidad;
                        break;
                    case 3:
                        total += precio3 * cantidad;
                        break;
                    case 4:
                        total += precio4 * cantidad;
                        break;
                    case 5:
                        total += precio5 * cantidad;
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("El valor total de venta es: $%.2f%n", total);*/
		
		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	        
	        while (true) {
	            LocalTime now = LocalTime.now();
	            String timeString = now.format(formatter);
	            System.out.println(timeString);
	            Thread.sleep(1000); // Espera un segundo antes de actualizar la hora
	        }
	}

}
