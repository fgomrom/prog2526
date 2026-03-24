package prog.ud7.ejercicios.ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		try {
			System.out.println("COMIENZO PROGRAMA DIVISIÓN");
			int dividendo = 5;
			int divisor = 0;
			System.out.println("Resultado: " + dividendo / divisor);
		} catch (ArithmeticException ex) {
			System.out.println("Imposible dividir por 0");
		} finally {
			System.out.println("FIN PROGRAMA DIVISIÓN");
		}
	}

}
