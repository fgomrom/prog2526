package prog.ud9.ejemplos;

import java.io.File;
import java.io.IOException;

public class EjemploFile {
    public static void main(String[] args) {
        File archivo = new File("notas.txt");

        try {
            if (archivo.exists()) {
                System.out.println("Archivo encontrado: " + archivo.getName());
                System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
            } else {
                // Intenta crear el archivo si no existe
                if (archivo.createNewFile()) {
                    System.out.println("El archivo no existía, pero ha sido creado con éxito.");
                }
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al intentar manipular el archivo: " + e.getMessage());
        }
    }
}
