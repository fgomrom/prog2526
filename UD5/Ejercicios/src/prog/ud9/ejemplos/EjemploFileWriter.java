package prog.ud9.ejemplos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileWriter {

	public static void main(String[] args) {
		File miFichero = new File("c:\\Users\\Fran Gómez\\prueba.txt");
		try {
			FileReader fw = new FileReader(miFichero);
			int caracter = 0;
			while (caracter != -1) {
				caracter = fw.read();
				System.out.println((char)caracter);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
