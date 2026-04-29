package prog.ud9.ejemplos;

import java.util.Scanner;

public class EjemploIO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre = args[0];
		System.out.println("Me llamo: " + nombre);
		sc.close();
	}

}
