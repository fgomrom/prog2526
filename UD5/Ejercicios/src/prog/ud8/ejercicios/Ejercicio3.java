package prog.ud8.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		List<String> nombres = new ArrayList<>();
		nombres.add("Manuel");
		nombres.add("Fran");
		nombres.add("Dani");
		nombres.add("Antonio");
		nombres.add("Dani");
		
		imprime(nombres);
		
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		nombres.add(nombre);
		
		imprime(nombres);
		
		System.out.println("Introrduzca nombre a eliminar: ");
		String eliminarNombre = sc.nextLine();
		if (nombres.remove(eliminarNombre)) {
			System.out.println("Nombre elminado!");
		} else {
			System.out.println("Nombre no encontrado");
		}
		
		System.out.println("Número total de nombres: " + nombres.size());
		
	}
	
	private static void imprime (List<String> lista) {
		for (String string : lista) {
			System.out.println(string);
		}
	}

}
