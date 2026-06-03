package prog.ud11.ejemplos;

import java.awt.*;
import java.awt.event.*;

public class DemoCompletoMenu extends Frame implements ActionListener {

	// Componentes de la interfaz
	private Label lblResultado;
	private MenuBar barraMenu;
	private Menu menuOpciones;
	private MenuItem itemSaludar, itemSalir;

	public DemoCompletoMenu() {
        // 1. Configuración de la ventana base
        setTitle("Demostración de Menús en AWT");
        setSize(400, 200);
        setLayout(new FlowLayout());

        // 2. Elemento de salida de información
        lblResultado = new Label("Selecciona una opción del menú de arriba.");
        add(lblResultado);

        // 3. CONSTRUCCIÓN DE LA JERARQUÍA DEL MENÚ
        barraMenu = new MenuBar();                // 1º La Barra Principal
        menuOpciones = new Menu("Opciones");      // 2º El Desplegable

        itemSaludar = new MenuItem("Saludar");   // 3º Las Opciones finales
        itemSalir = new MenuItem("Salir");

        // 4. ENSAMBLAR LAS PIEZAS (De menor a mayor)
        menuOpciones.add(itemSaludar);            // Metemos "Saludar" en "Opciones"
        menuOpciones.addSeparator();              // Añade una línea divisoria estética
        menuOpciones.add(itemSalir);              // Metemos "Salir" en "Opciones"

        barraMenu.add(menuOpciones);              // Metemos el menú entero en la barra

        // 5. ASIGNAR LA BARRA A LA VENTANA
        // ¡OJO! No se usa "add()". Las barras de menú tienen su propio método especial:
        setMenuBar(barraMenu);

        // 6. ENLAZAR EVENTOS
        itemSaludar.addActionListener(this);
        itemSalir.addActionListener(this);
    }

	// 7. CONTROLADOR DE EVENTOS
	@Override
	public void actionPerformed(ActionEvent e) {
		// Identificamos qué opción del menú se ha pulsado
		if (e.getSource() == itemSaludar) {
			lblResultado.setText("¡Hola! Has ejecutado una acción desde el menú.");
		} else if (e.getSource() == itemSalir) {
			System.exit(0); // Cierre limpio de la aplicación profesional
		}
	}

	public static void main(String[] args) {
		DemoCompletoMenu app = new DemoCompletoMenu();
		app.setVisible(true);
	}
}
