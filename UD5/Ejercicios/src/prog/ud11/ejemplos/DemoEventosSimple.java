package prog.ud11.ejemplos;

import java.awt.Frame;
import java.awt.Button;
import java.awt.Label;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DemoEventosSimple {

    public static void main(String[] args) {
        
        // 1. CREAMOS LOS OBJETOS VISUALES
        Frame ventana = new Frame("Eventos sin Herencia");
        ventana.setSize(300, 150);
        ventana.setLayout(new FlowLayout());

        Label lblEstado = new Label("La luz está: APAGADA");
        Button btnInterruptor = new Button("Presionar Interruptor");

        ventana.add(lblEstado);
        ventana.add(btnInterruptor);

        // 2. CREAMOS EL ESCUCHADOR (Instanciamos la interfaz directamente)
        // Aquí se ve claramente que ActionListener es un OBJETO que se añade al botón
        ActionListener escuchadorClick = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Este código se ejecutará SOLO cuando se pulse 'btnInterruptor'
                lblEstado.setText("La luz está: ENCENDIDA ✨");
            }
        };

        // 3. CONECTAMOS EL OBJETO BOTÓN CON EL OBJETO ESCUCHADOR
        btnInterruptor.addActionListener(escuchadorClick);

        // Hacer la ventana visible
        ventana.setVisible(true);
    }
}
