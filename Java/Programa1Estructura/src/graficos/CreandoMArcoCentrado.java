package graficos;
import java.awt.*;

import javax.swing.*;

public class CreandoMArcoCentrado {

	public static void main(String[] args) {
		MarcoCentrado mimarc=new MarcoCentrado();
		mimarc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarc.setVisible(true);;

	}

}


class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		//getDefaultToolkit
		Toolkit miPantalla= Toolkit.getDefaultToolkit();
		
		Dimension tamPantalla=miPantalla.getScreenSize();
		int alturaP=tamPantalla.height;
		int anchoP=tamPantalla.width;
		setSize(anchoP/2,alturaP/2);
		setLocation(anchoP/4,alturaP/4);
		setTitle("Marco Centrado");
		
		Image miIcono=miPantalla.getImage("src/graficos/icono.gif");
		setIconImage(miIcono);
		
	}
}

