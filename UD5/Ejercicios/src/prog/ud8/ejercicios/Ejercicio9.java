package prog.ud8.ejercicios;

import java.util.SortedSet;
import java.util.TreeSet;

import prog.comunes.Persona;

public class Ejercicio9 {

	public static void main(String[] args) {
		SortedSet<Persona> personas = new TreeSet<>();
		Persona fran = new Persona("Francisco"); 
		Persona ana = new Persona("Ana"); 
		personas.add(fran);
		personas.add(new Persona("Ana"));
		fran.compareTo(ana);
	}

}
