package prog.ud5.ejercicios.ejercicio6;

import java.io.IOException;

public class Calculadora {
	
	public static double sumar(double a, double b) {
		return a + b;
	}
	
	public static double restar(double a, double b) {
		return a - b;
	}
	
	public static int dividir(int a, int b) throws IOException {
		int resultado = 0;
		try {
			resultado = a / b;
		} catch (ArithmeticException e) {
			throw new IOException("Division por cero");
		}
		return resultado;
	}
	
	public static double multiplicar(double a, double b) {
		return a * b;
	}
	
}
