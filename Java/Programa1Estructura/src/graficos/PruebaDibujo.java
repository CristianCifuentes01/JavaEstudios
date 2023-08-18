package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoDibujo marco=new MarcoDibujo();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoDibujo extends JFrame{
	public MarcoDibujo() {
		setTitle("Marco");
		setVisible(true);
		setSize(400,400);
		LaminaFiguras Figuras= new LaminaFiguras();
		add(Figuras);
		Figuras.setBackground(SystemColor.window.darker().darker());
	}
}
class LaminaFiguras extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		/*g.drawRect(100,100, 200, 200);
		g.drawArc(50, 100, 100, 200, 120, 150);*/
		
		Graphics2D g2=(Graphics2D) g;
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
		
		g2.setPaint(Color.red);
		
		g2.fill(rectangulo);
		
		Ellipse2D elipse=new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.setPaint(new Color(237,164,25).darker());
		g2.fill(elipse);
		
		//g2.draw(new Line2D.Double(100,100,300,250));
		
		
		double CentroenX=rectangulo.getCenterX();
		double CentroenY=rectangulo.getCenterY();
		double Radio=rectangulo.getHeight();
		Ellipse2D circulo=new Ellipse2D.Double();
		circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX+Radio, CentroenY+Radio);
		g2.setPaint(Color.GREEN.brighter());
		g2.draw(circulo);
		
	}
	
}
