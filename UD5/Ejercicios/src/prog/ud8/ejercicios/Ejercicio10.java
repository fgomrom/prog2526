package prog.ud8.ejercicios;

import java.util.SortedSet;
import java.util.TreeSet;

import prog.comunes.Persona;

public class Ejercicio10 {

	public static void main(String[] args) {
		SortedSet<Persona> ss = new TreeSet<>(new ComparadorApellidoNombreEdad());
		ss.add(new Persona("Fran", "Gonzalez", 18));
		ss.add(new Persona("Fran", "Gomez", 19));
		ss.add(new Persona("Paco", "Gomez", 18));
		ss.add(new Persona("Fran", "Gomez", 18));
		System.out.println(ss);
	}

}
