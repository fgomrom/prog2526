package prog.ud11.ejemplos.evento;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionListener;

public class EjemploEvento {

	public static void main(String[] args) {

		Frame ventana = new Frame("Eventos");
		ventana.setSize(300, 150);
		ventana.setLayout(new FlowLayout());

		Button miBoton = new Button("Click aquí");

		ventana.add(miBoton);

		ActionListener miListener = new MiListener();

		miBoton.addActionListener(miListener);

		ventana.setVisible(true);
	}

}
