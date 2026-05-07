package prog.ud9.ejercicios;

import java.io.IOException;

public class Ejercicio4 {

	public static void main(String[] args) throws IOException {
		byte[] palabra = new byte[5];
		System.in.read(palabra);
		System.out.println(new String(palabra));
		
	}

}
