package graficos;

import java.awt.GraphicsEnvironment;
import javax.swing.*;

public class purebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []nombre=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
	
		for(String nombresF: nombre) {
			System.out.println(nombresF);
		}
	}
	

}
