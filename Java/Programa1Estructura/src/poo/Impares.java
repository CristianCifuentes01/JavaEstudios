package poo;

public class Impares {

	public static void main (String [] args) {	
		int producto = 1;
        for (int i=1;i<=15; i+=2) {
            producto *= i;
            System.out.println("Producto: " + producto);
        }
        
        int producto2=1;
        for (int i=1;i<=15; i++) {
        	if(i%2==1) {
        		producto2 *= i;
        		System.out.println("Producto: " + producto2);
        	} 
        }
	}
	
}

	

