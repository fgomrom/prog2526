package prog.ud8.ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import prog.comunes.Persona;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		List personas = new ArrayList();
		
		Persona fran = new Persona("Fran");
		Persona ana = new Persona("Ana");
		personas.add("fran");
		personas.add(new Persona("Juan"));
		personas.add(ana);
		personas.add(new Persona("Juan"));
		
		// Copia con el constructor
		List copia = new LinkedList(personas);
		System.out.println(copia);
		
		// Copia con el add
		List copia2 = new LinkedList();
		for(Object x: personas) {
			copia2.add(x);
		}
		copia2.addAll(personas);
		System.out.println(copia2);
		
		// Intercambiar primera y última
		if(!copia.isEmpty()) {
			int primero = 0;
			int ultimo = copia.size() - 1;
			Object aux =  copia.get(ultimo);
			copia.set(ultimo, copia.get(primero));
			copia.set(primero, aux);
		}
		System.out.println(copia);
	}

}
