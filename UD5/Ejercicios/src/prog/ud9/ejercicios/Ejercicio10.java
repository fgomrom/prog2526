package prog.ud9.ejercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
        String nombreFichero = "notas.txt";
        File archivo = new File(nombreFichero);

        // 1. Añadir contenido al final (Append)
        try (FileWriter fw = new FileWriter(archivo, true)) {
            fw.write("\nNueva línea añadida desde Java.");
            System.out.println("Contenido añadido con éxito.");
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }

        // 2. Leer y mostrar el contenido por consola
        System.out.println("--- Contenido actual del fichero ---");
        try (Scanner lector = new Scanner(archivo)) {
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
    }
}
