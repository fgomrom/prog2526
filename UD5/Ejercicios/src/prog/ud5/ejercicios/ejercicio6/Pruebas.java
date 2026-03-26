package prog.ud5.ejercicios.ejercicio6;

import java.io.IOException;

public class Pruebas {

	public static void main(String[] args) {
		try {
			System.out.println(hacerDivisionEntera(2,0));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static int hacerDivisionEntera(int a, int b) throws IOException {
		return (int)Calculadora.dividir(a, b);
	}

}
