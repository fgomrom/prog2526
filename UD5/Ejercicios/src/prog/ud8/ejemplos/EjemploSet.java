package prog.ud8.ejemplos;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class EjemploSet {

	public static void main(String[] args) {
		// HashSet
		Set<Integer> hash = new HashSet<>();
		hash.add(1);
		hash.add(0);
		hash.add(-1);
		System.out.println(hash);
		
		
		
		
		
		
		// Imagina que son cromos
        Set<String> miColeccion = new HashSet<>(); 
        
        miColeccion.add("Pikachu");
        miColeccion.add("Charizard");
        miColeccion.add("Pikachu"); // ¡Java lo ignorará silenciosamente!

        System.out.println("Mi colección tiene: " + miColeccion.size() + " elementos.");
        // Imprimirá 2, no 3.
		
		// Set es un subconjunto de SortedSet por eso
		// puede ser implementado por TreeSet
		Set<String> conjunto2 = new TreeSet<String>();
		SortedSet<String> conjunto3 = new TreeSet<String>();
		
		// Con un Set normal (HashSet)
		Set<Integer> bolsa = new HashSet<>();
		bolsa.add(90);
		bolsa.add(10);
		bolsa.add(50);
		System.out.println(bolsa); // Imprime: [50, 90, 10] (O cualquier orden aleatorio)

		// Con un SortedSet (TreeSet)
		SortedSet<Integer> vitrina = new TreeSet<>();
		vitrina.add(90);
		vitrina.add(10);
		vitrina.add(50);
		System.out.println(vitrina); // Imprime SIEMPRE: [10, 50, 90]
	}

}
