package prog.ud11.ejemplos.evento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Listener para mi botón.
 */
public class MiListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Botón pulsado!");
	}

}
