package prog.ud8.ejercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio5 {

	public static void main(String[] args) {
		Set<Integer> conjuntoEnteros = new HashSet<>();
		conjuntoEnteros.add(1);
		conjuntoEnteros.add(2);
		conjuntoEnteros.add(3);
		conjuntoEnteros.add(4);
		conjuntoEnteros.add(5);
//		System.out.println(conjuntoEnteros);
		
		conjuntoEnteros.add(3);
//		System.out.println(conjuntoEnteros);
		
		conjuntoEnteros.add(null);
		conjuntoEnteros.add(null);
//		System.out.println(conjuntoEnteros);
		
		Set<Integer> numerosPrimos = new HashSet<>();
		numerosPrimos.add(3);
		numerosPrimos.add(2);
		System.out.println(conjuntoEnteros);
		System.out.println(numerosPrimos);
		boolean b = conjuntoEnteros.containsAll(numerosPrimos);
		System.out.println(b);
//		b?System.out.println("Sí"):System.out.println("No");
		
		final List<Integer> lista = new ArrayList<>(conjuntoEnteros);
		//lista.addAll(conjuntoEnteros); // Otra opción
		lista.add(6);
		lista.remove(0);
		//lista = new ArrayList<>(); // No se puede reasignar pero si modificar su contenido
	}

}
