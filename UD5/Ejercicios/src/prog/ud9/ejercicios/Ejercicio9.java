package prog.ud9.ejercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio9 {

	public static void main(String[] args) throws IOException {
		File file = new File("notas.txt");
		FileWriter fw = null;
		if (file.exists()) {
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath());
		} else {
			System.out.println("El archivo no existe.");
			try {
				fw = new FileWriter(file);
				if (file.createNewFile()) {
					System.out.println(file.getName());
					System.out.println(file.getAbsolutePath());
					fw.write("Hola");
				}
			} catch (IOException e) {
				System.err.println(e.getMessage());
			} finally {
				fw.close();
			}
		}
	}

}
