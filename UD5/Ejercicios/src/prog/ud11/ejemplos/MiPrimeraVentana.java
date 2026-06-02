package prog.ud11.ejemplos;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class MiPrimeraVentana {

	public static void main(String[] args) {
		// 1. CREAR EL CONTENEDOR (La ventana vacía)
        Frame ventana = new Frame("Mi Primera App");
        ventana.setSize(300, 200); // Ancho: 300 píxeles, Alto: 200 píxeles
        ventana.setLayout(new FlowLayout()); // El "organizador" automático

        // 2. CREAR EL CONTROL (La etiqueta de texto)
        Label etiqueta = new Label("Hola, esto es una etiqueta AWT.");

        // 3. METER EL CONTROL DENTRO DEL CONTENEDOR
        ventana.add(etiqueta);

        // 4. HACERLA VISIBLE (Por defecto nacen invisibles en memoria)
        ventana.setVisible(true);
	}

}
