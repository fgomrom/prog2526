package prog.ud8.ejemplos;

import java.util.SortedSet;
import java.util.TreeSet;

import prog.comunes.Persona;

public class EjemploComparar {

	public static void main(String[] args) {
//		SortedSet<Persona> personas = new TreeSet<>();
//		personas.add(new Persona("fran"));
//		personas.add(new Persona("ana"));
//		System.out.println(personas);
		
		SortedSet<String> personas = new TreeSet<>();
		personas.add("fran");
		personas.add("ana");
		System.out.println(personas);
	}

}
