package poo;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		Reloj miReloj=new Reloj();
		miReloj.enMarcha(3000, true);
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		System.exit(0);
	}

}

class Reloj{
	/*public Reloj(int intervalo, boolean sonido) {
		this.intervalo=intervalo;
		this.sonido=sonido;
		
	}*/
	
	
	public void enMarcha(final int intervalo, final boolean sonido) {
		
		class DameHora2 implements ActionListener{
			public void actionPerformed(ActionEvent evento) {
				Date ahora =new Date();
				System.out.println("Hora cada "+intervalo+" segundo: "+ahora);
				
				if (sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		
		ActionListener oyente = new DameHora2();
		Timer miTemporizador= new Timer(intervalo,oyente);
		miTemporizador.start();
	}
	//private int intervalo;
	//private boolean sonido;
	
	
}
