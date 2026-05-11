package prog.ud9.ejercicios;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejer10 {

	public static void main(String[] args) throws IOException {
		String nombreFichero ="C:\\Users\\Fran Gómez\\PROG\\UD5\\Ejercicios\\src\\prog\\ud9\\ejercicios\\Ejercicio10.txt";
		File file = new File(nombreFichero);
		if (file.exists()) {
			FileWriter fw = new FileWriter(file, true);
			fw.write("Fran");
			fw.close();
			FileReader fr = new FileReader(file);
			int unByte;
			while ((unByte = fr.read()) != -1) {
				System.out.print((char)unByte + " ");
			}
			fr.close();
		} else {
			System.out.println("No existe fichero.");
		}
	}

}
