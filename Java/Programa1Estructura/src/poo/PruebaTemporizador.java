package poo;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;
public class PruebaTemporizador {

	public static void main(String[] args) {
		int num=3;
		int tiempS=num*1000;
		
		DameHora oyente=new DameHora();
		Timer miTemporizador=new Timer(tiempS,oyente);
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");

		System.exit(0);
	}

}

class DameHora implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		Date ahora=new Date();
		
		System.out.println("Hora cada 5 segundos: "+  ahora);
		Toolkit.getDefaultToolkit().beep();
	}
}
