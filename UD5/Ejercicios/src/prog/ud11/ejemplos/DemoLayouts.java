package prog.ud11.ejemplos;

import java.awt.Frame;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class DemoLayouts {

    public static void main(String[] args) {
        // Descomenta la línea del ejemplo que quieras probar:
        
//        ejemploAbsoluto();
         ejemploFlowLayout();
        // ejemploGridLayout();
        // ejemploBorderLayout();
    }

    // 1. EJEMPLO POSICIONAMIENTO ABSOLUTO (Cinta métrica / Coordenadas fijas)
    public static void ejemploAbsoluto() {
        Frame v = new Frame("1. Posicionamiento Absoluto");
        v.setSize(400, 300);
        v.setLayout(null); // Desactivamos el organizador

        Button b1 = new Button("Botón A (50, 50)");
        Button b2 = new Button("Botón B (150, 150)");

        // Ponemos coordenadas y tamaños fijos en píxeles
        // Esto sólo se hace con posicionamiento absoluto
        b1.setBounds(50, 50, 150, 40);
        b2.setBounds(150, 150, 150, 40);

        v.add(b1);
        v.add(b2);
        v.setVisible(true);
    }

    // 2. EJEMPLO FLOWLAYOUT (La fila del supermercado)
    public static void ejemploFlowLayout() {
        Frame v = new Frame("2. Ejemplo FlowLayout");
        v.setSize(400, 200);
        v.setLayout(new FlowLayout(FlowLayout.CENTER)); // En fila y centrados

        // Para dar posición y tamaño a los componentes cuando se usa
        // un LayoutManager, no usamos setSize ni setBound sino:
        Button miBoton = new Button("Mi botón");
        miBoton.setPreferredSize(new Dimension(300, 100));
        
        // Añadimos varios botones en orden
        v.add(new Button("Primero"));
        v.add(new Button("Segundo"));
        v.add(new Button("Tercero"));
        v.add(new Button("Cuarto"));
        v.add(new Button("Quinto"));
        v.add(miBoton);

        v.setVisible(true);
    }

    // 3. EJEMPLO GRIDLAYOUT (El tablero de juego / Casillero)
    public static void ejemploGridLayout() {
        Frame v = new Frame("3. Ejemplo GridLayout");
        v.setSize(300, 300);
        v.setLayout(new GridLayout(3, 2)); // 3 Filas y 2 Columnas exactas

        // Rellenamos las 6 celdas disponibles
        v.add(new Button("Celda 1"));
        v.add(new Button("Celda 2"));
        v.add(new Button("Celda 3"));
        v.add(new Button("Celda 4"));
        v.add(new Button("Celda 5"));
        v.add(new Button("Celda 6"));

        v.setVisible(true);
    }

    // 4. EJEMPLO BORDERLAYOUT (El mapa: Norte, Sur, Este, Oeste y Centro)
    public static void ejemploBorderLayout() {
        Frame v = new Frame("4. Ejemplo BorderLayout");
        v.setSize(400, 300);
        v.setLayout(new BorderLayout()); // Layout por defecto de Frame, pero lo hacemos explícito

        // Añadimos un componente en cada zona geográfica obligatoria
        v.add(new Button("NORTE (Menú/Título)"), BorderLayout.NORTH);
        v.add(new Button("SUR (Barra de estado)"), BorderLayout.SOUTH);
        v.add(new Button("ESTE"), BorderLayout.EAST);
        v.add(new Button("OESTE (Lateral)"), BorderLayout.WEST);
        v.add(new Button("CENTRO (Área Principal)"), BorderLayout.CENTER);

        v.setVisible(true);
    }
}
