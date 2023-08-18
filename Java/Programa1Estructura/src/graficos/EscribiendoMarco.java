package graficos;
import javax.swing.*;
import java.awt.*;
public class EscribiendoMarco {

	public static void main(String[] args) {
		

		MarcoConTexto mimarco=new MarcoConTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}

class MarcoConTexto extends JFrame{
	
	public MarcoConTexto() {
		//getDefaultToolkit
		Toolkit miPantalla= Toolkit.getDefaultToolkit();
		setVisible(true);
		/*Dimension tamPantalla=miPantalla.getScreenSize();
		int alturaP=tamPantalla.height;
		int anchoP=tamPantalla.width;*/
		setSize(600,450);
		//setLocation(400,200);
		setTitle("Marco Centrado");
		
		Lamina lam=new Lamina();
		//lam.setForeground(Color.black);  //PARA QUE TODOS LOS ELEMNTOS DE LA LAMINA TENGAN UN MISMO COLOR 
		add(lam);
		
		Image miIcono=miPantalla.getImage("src/graficos/icono.gif");
		setIconImage(miIcono);
		
	}
}

class Lamina extends JPanel {
   
	
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D) g;
        
        Font mifuente=new Font("times new roman", Font.BOLD,26);
        g2.setFont(mifuente);
        g2.setColor(Color.GRAY);
        g2.drawString("Cristian", 100, 100);
        
        g2.setFont(new Font("calibri", Font.ITALIC,30));
        g2.setColor(new Color(0,0,205));
        g2.drawString("Cristian", 100, 200);
    }
}