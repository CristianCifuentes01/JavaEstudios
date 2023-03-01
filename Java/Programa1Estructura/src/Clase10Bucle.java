import javax.swing.*;
public class Clase10Bucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Contraseña="123hola";
		String pass="";
		while(Contraseña.equals(pass)==false) {
			pass=JOptionPane.showInputDialog("Intruduce la contraseña ");
			
			if(Contraseña.equals(pass)==false) {
				System.out.println("Contraseña incorrecta");
			}
		}
		System.out.println("Contraseña correcta. Acceso permitido");
	}

}
