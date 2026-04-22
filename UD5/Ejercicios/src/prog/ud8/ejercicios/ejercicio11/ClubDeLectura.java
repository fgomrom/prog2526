package prog.ud8.ejercicios.ejercicio11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ClubDeLectura {
	private Set<String> biblioteca;

	public ClubDeLectura() {
		this.biblioteca = new HashSet<>();
	}

	public void agregarLibro(String libro) {
		biblioteca.add(libro);
	}

	public void mostrarBiblioteca() {

		Iterator<String> it = biblioteca.iterator();

		while (it.hasNext()) {
			String libro = it.next();
			if (libro.equals("El principito"))
				it.remove();
			System.out.println(libro);
		}

		// Da una excepción porque estoy modificando el conjunto a la vez que lo recorro
		for (String libro : biblioteca) {
			if (libro.equals("El quijote"))
				biblioteca.remove(libro);
			System.out.println(libro);
		}
	}
}
