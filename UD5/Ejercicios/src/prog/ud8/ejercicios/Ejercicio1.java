package prog.ud8.ejercicios;

import java.util.ArrayList;
import java.util.List;

import prog.comunes.Persona;

public class Ejercicio1 {

	public static void main(String[] args) {
		//1
		List personas = null;
		System.out.println(personas);
		//2
		personas = new ArrayList();
		System.out.println(personas);
		//3
		Persona fran = new Persona("Fran");
		Persona ana = new Persona("Ana");
		personas.add(fran);
		personas.add(new Persona("Juan"));
		personas.add(ana);
		personas.add(new Persona("Juan"));
		System.out.println(personas);
		//4
		System.out.println(personas.getLast());
		//5
		Persona persona;
		persona = (Persona)personas.getFirst();
		persona.setNombre("Paco");
		//En una línea
		((Persona)personas.getFirst()).setNombre("Paco");
		//6
		int indiceCentral = personas.size()/2 - 1;
		personas.remove(indiceCentral);
		System.out.println(personas);
		//8
		for(int i = 0; i < personas.size(); i++) {
			System.out.println(personas.get(i));
		}
		//9
		Persona ale = new Persona("Ale");
		personas.add(ale);
		if (personas.contains(ale))
			System.out.println("La persona: " + ale + " está en la lista.");
		System.out.println(personas);
		//10
		personas.clear();
		if (personas.isEmpty())
			System.out.println("Está vacía.");
		System.out.println(personas);
	}

}
