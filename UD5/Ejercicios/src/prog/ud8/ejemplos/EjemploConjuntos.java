package prog.ud8.ejemplos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploConjuntos {

	public static void main(String[] args) {
		// HashSet
		Set<Integer> hash = new HashSet<>();
		hash.add(1);
		hash.add(0);
		hash.add(-1);
		System.out.println(hash);
		
		Set<Integer> linked = new LinkedHashSet<>();
		linked.add(1);
		linked.add(0);
		linked.add(-1);
		System.out.println(linked);
		
		Set<Integer> tree = new TreeSet<>();
		tree.add(1);
		tree.add(0);
		tree.add(-1);
		System.out.println(tree);
	}

}
