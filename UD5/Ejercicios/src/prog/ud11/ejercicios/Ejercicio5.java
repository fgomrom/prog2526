package prog.ud11.ejercicios;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;

public class Ejercicio5 {

	public static void main(String[] args) {
		Frame frame = new Frame("Titulo");
		Label label= new Label("Texto de prueba");
		label.setAlignment(Label.CENTER);
		frame.add(label, BorderLayout.CENTER);
		
		frame.setVisible(true);
		frame.setSize(300,300);
		
	}

}
