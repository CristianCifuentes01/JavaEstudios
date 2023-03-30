//import javax.swing.*;
public class Clase18MatricesBidimensionales {

	public static void main(String[] args) {
		int colum=4,filas=5;
		int [][] matriz1= {
				{1,2,3,4,5},
				{2,4,6,7,8},
				{1,2,3,4,5},
				{2,4,6,7,8},
		};
		
		for(int i=0;i<colum;i++) {
			System.out.println();
			for(int j=0;j<filas;j++) {
				System.out.print(matriz1[i][j]+" ");
			}
		}
		System.out.println();
		System.out.println();
		for(int[]fila:matriz1) {
			System.out.println();
			for(int z:fila) {
				System.out.print(z+" ");
			}
		}

	}

}
