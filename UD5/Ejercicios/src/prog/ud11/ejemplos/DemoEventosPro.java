package prog.ud11.ejemplos;

import java.awt.Frame;
import java.awt.Button;
import java.awt.Label;
import java.awt.FlowLayout;
import java.awt.event.ActionListener; // La interfaz escuchadora
import java.awt.event.ActionEvent; // El objeto evento

/**
 * Vamos a crear un "Contador de Clics". Cada vez que el usuario pulse el botón,
 * se disparará un evento, capturaremos el origen y aumentaremos un número en la
 * pantalla.
 */

// 1. Decimos que nuestra ventana IMPLEMENTA la interfaz para escuchar clics
public class DemoEventosPro extends Frame implements ActionListener {

	private Label lblContador;
	private Button btnIncrementar;
	private int clics = 0; // Variable para guardar el estado

	public DemoEventosPro() {
		setTitle("Práctica de Eventos AWT");
		setSize(300, 150);
		setLayout(new FlowLayout());

		// Crear componentes
		lblContador = new Label("Clicks: 0");
		btnIncrementar = new Button("¡Púlsame!");

		// Añadir componentes a la ventana
		add(lblContador);
		add(btnIncrementar);

		// 2. CONEXIÓN CRUCIAL: Registramos la ventana como escuchadora del botón
		// Le decimos al botón: "Cuando te pulsen, avisa a 'this' (esta misma clase)"
		btnIncrementar.addActionListener(this);
	}

	// 3. EL CONTROLADOR: El método obligatorio que exige la interfaz ActionListener
	// Java llamará a este método automáticamente cada vez que se pulse el botón
	@Override
	public void actionPerformed(ActionEvent e) {
		clics++; // Lógica de negocio: incrementamos el contador

		// Modificamos la interfaz para mostrar el resultado (Salida de información)
		lblContador.setText("Clicks: " + clics);
	}

	public static void main(String[] args) {
		DemoEventosPro app = new DemoEventosPro();
		app.setVisible(true);
	}
}
