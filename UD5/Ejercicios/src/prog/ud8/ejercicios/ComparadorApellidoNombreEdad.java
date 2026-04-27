package prog.ud8.ejercicios;

import java.util.Comparator;

import prog.comunes.Persona;

/*
 * Fran Gómez 18
 * Fran González 18
 * Fran González 19
 * Pepe González 22
 */
public class ComparadorApellidoNombreEdad implements Comparator<Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {
		
		// Compara apellidos teniendo en cuenta que pueden ser nulos
		if (p1.getApellido() == null && p2.getApellido() == null) {
			// Si ambos son nulos es como si fuera iguales --> comparo nombre y edad
			if (p1.getNombre().equals(p2.getNombre())) {
				if (p1.getEdad() == p2.getEdad()) {
					return 0;
				} else if (p1.getEdad() < p2.getEdad()) {
					return -1;
				} else {
					return 1;
				}
			} else {
				return p1.getNombre().compareTo(p2.getNombre());
			}
			// Si sólo uno es nulo, es menor que uno no nulo
		} else if (p1.getApellido() == null && p2.getApellido() != null) {
			return -1;
		} else if (p1.getApellido() != null && p2.getApellido() == null) {
			return 1;
		} else if (!p1.getApellido().equals(p2.getApellido())) {
			// Si son iguales pero no nulos, hacemos como teníamos
			return p1.getApellido().compareTo(p2.getApellido());
		}

		// Una vez comparado los apellidos seguimos con nombre y edad.
		if (p1.getNombre().equals(p2.getNombre())) {
			if (p1.getEdad() == p2.getEdad()) {
				return 0;
			} else if (p1.getEdad() < p2.getEdad()) {
				return -1;
			} else {
				return 1;
			}
		} else {
			return p1.getNombre().compareTo(p2.getNombre());
		}
	}

}
