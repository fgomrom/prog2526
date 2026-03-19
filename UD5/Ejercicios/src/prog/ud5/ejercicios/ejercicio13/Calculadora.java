package prog.ud5.ejercicios.ejercicio13;

import java.util.Scanner;

public class Calculadora {

	private static Scanner sc = new Scanner(System.in);
	
	private static double resultado;
	
	private static final double PI = 3.14;
	
	public static void menu() {
		System.out.println("Indroduzca una opción:");
		System.out.println("1: Sumar");
		System.out.println("2: Restar");
		int opcion = sc.nextInt();
		switch (opcion) {
		case 1 -> resultado = sumar();
		default ->
		throw new IllegalArgumentException("Unexpected value: " + opcion);
		}
	}
	
	public static double sumar() {
		System.out.println("Introduzca dos números:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		//Invocar a Operaciones
		return Operaciones.sumar(a, b);
	}
	
	public static void resultado() {
		System.out.println("Resultado: " + resultado);
	}

}
