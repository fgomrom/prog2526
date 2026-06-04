package prog.ud11.ejemplos.evento;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

		setVisible(true);
	}

	public static void main(String[] args) {
		new EjemploEvento();
		
	}

}
