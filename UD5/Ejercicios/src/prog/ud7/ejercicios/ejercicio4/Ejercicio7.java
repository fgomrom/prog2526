package prog.ud7.ejercicios.ejercicio4;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		try {
			introduceEnteros();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Fin");
		}
		System.out.println("Finalísmo");
	}
	
	private static void introduceEnteros() throws IllegalArgumentException{
		int[] lista = new int[5];
		lista[0] = 0;
		lista[1] = 12;
		lista[2] = 20;
		lista[3] = 13;
		lista[4] = 40;
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//Invocar método y si devuelve true lanzar excepción
		if (estaEnLista(lista, num))
			throw new IllegalArgumentException("Número repetido");
		
		for (int e: lista) {
			System.out.println(e);
		}
	}
	
	// Crear método que diga si un número está en una lista
	private static boolean estaEnLista(int[] lista, int num) {
		for (int e: lista) {
			if (e == num)
				return true;
		}
		return false;
	}
	

}
