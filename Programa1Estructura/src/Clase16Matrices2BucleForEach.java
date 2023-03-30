import javax.swing.JOptionPane;

public class Clase16Matrices2BucleForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] paises=new String[8];
		
		for(int i=0;i<8;i++) {
			paises[i]=JOptionPane.showInputDialog("Introduce el pais "+(i+1)); 
		}
		
		
		//for(int i=0;i<paises.length;i++) {
			//System.out.println("Pais "+(i+1)+" es "+paises[i]);
		//}
		
		
		//This is the For "siplificado"
		for(String elemento:paises) {
			System.out.println("Pais: "+elemento);
		}
	}

}
