
public class Clase4Math {

	public static void main(String[] args) {
		//Raiz cuadrada 
		double raiz=Math.sqrt(9);
		System.out.println("La raiz de 9 es "+raiz);
		//Redondear un numero 
		double num1=5.85;
		int resultado=(int)Math.round(num1);
		System.out.println("El numero "+num1+" redondeado es "+resultado);
		
		//Potenciar un numero 
		
		double base=5,exponente=3;
		int base1=(int)base;
		int exp=(int)exponente;
		int resultado2=(int)Math.pow(base, exponente);
		System.out.println(base1+" potenciado en "+exp+" es: "+resultado2);
	}

}
