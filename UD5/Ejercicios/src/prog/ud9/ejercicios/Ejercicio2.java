package prog.ud9.ejercicios;

import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// Creamos el escritor hacia un archivo
        FileWriter escritor = new FileWriter("prueba.txt");
        
        // Escribimos algo
        escritor.write("¿Donde está mi texto?");
        
        System.out.println("He escrito en el archivo... ¿o no?");
        
        // El programa se queda esperando aquí para que no termine
        Thread.sleep(3000); // Espera 3 segundos
        
        // No hemos puesto ni flush() ni close()
        escritor.close();
	}

}
