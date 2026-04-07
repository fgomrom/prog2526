package prog.ud8.ejemplos.listas;

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
		
	}

}
