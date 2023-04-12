package prueba2;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
public class CaritaFeliz extends JPanel{
	public void componetesPintura(Graphics g) {
		super.paintComponent(g);
		
		//Dibuja la cara
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 200, 200);
		//Dibuja ojos 
		g.setColor(Color.BLACK);
		g.fillOval(55, 65, 30, 30);
		g.fillOval(135, 65, 30, 30);
		
		//DIBUJA BOCA
		g.fillOval(50, 110, 120, 60);
		
		//CONVIERTE LA BOCA EN RISA
		g.setColor(Color.YELLOW);
		g.fillRect(50, 110, 120, 30);
		g.fillOval(50, 120, 120, 40);
	}
	public static void main (String args[]) {
		CaritaFeliz panel=new CaritaFeliz();
		JFrame aplication=new JFrame();
		
		aplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplication.add(panel);
		aplication.setSize(230,250);
		aplication.setVisible(true);
	}

}
