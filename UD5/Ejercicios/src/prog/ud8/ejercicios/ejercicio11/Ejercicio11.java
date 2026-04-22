package prog.ud8.ejercicios.ejercicio11;

import prog.comunes.Persona;

public class Ejercicio11 {

	public static void main(String[] args) {
		ClubDeLectura clubFranYAmigos = new ClubDeLectura();
		ClubDeLectura clubOscarYAmigos = new ClubDeLectura();
		clubOscarYAmigos.agregarLibro("El quijote");
		clubOscarYAmigos.agregarLibro("El principito");
		clubOscarYAmigos.agregarLibro("El niño del pijama de rayas");
		clubOscarYAmigos.mostrarBiblioteca();
		
		
	}

}
