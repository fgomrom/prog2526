package prog.comunes;

import prog.ud4.ejercicios.ejercicio2.DiaDeLaSemana;

public class Persona {
	// Atributos
	public String nombre;
	public int edad;

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona() {
		
	}
	
	public void setEdad(int edad) {
		if (edad < 0) {
			throw new EdadInvalidaException("Edad negativa");
		}
		this.edad = edad;
	}

	@Override
	public String toString() {
		return nombre + " " + edad;
	}

	@Override
	public boolean equals(Object obj) {
		return this.nombre.equals(((Persona) obj).nombre) &&
				this.edad == ((Persona) obj).edad;
	}
}
