package prog.ud11.ejemplos.evento;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EjemploEvento extends Frame{
	
	EjemploEvento() {
		setSize(300, 150);
		setLayout(new FlowLayout());

		Button miBoton = new Button("Click aquí");

		add(miBoton);
		
//		ActionListener escuchadorBoton = new MiListener();
//		miBoton.addActionListener(escuchadorBoton);
		
		miBoton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Botón pulsado!");
			}
		});
		
		WindowListener wl = new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		};

		addWindowListener(wl);
		setVisible(true);
	}

	public static void main(String[] args) {
		new EjemploEvento();
		
	}

}
