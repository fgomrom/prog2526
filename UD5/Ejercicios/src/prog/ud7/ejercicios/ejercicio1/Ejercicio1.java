package prog.ud7.ejercicios.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("COMIENZO PROGRAMA DIVISIÓN");
			int dividendo = 5;
			int divisor = 0;
			System.out.println("Resultado: " + dividendo / divisor);
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("FIN PROGRAMA DIVISIÓN");
			sc.close();
		}
	}

}
