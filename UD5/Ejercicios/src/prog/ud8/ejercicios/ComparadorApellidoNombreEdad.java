package prog.ud8.ejercicios;

import java.util.Comparator;

import prog.comunes.Persona;

/*
 * Fran Gómez 18
 * Fran González 18
 * Fran González 19
 * Pepe González 22
 */
public class ComparadorApellidoNombreEdad implements Comparator<Persona>{

	@Override
	public int compare(Persona p1, Persona p2) {
		
		if (p1.getApellido().equals(p2.getApellido())) {
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
		} else {
			return p1.getApellido().compareTo(p2.getApellido());
		}
	}
	
}
