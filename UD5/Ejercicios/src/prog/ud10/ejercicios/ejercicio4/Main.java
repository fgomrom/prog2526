package prog.ud10.ejercicios.ejercicio4;

import java.math.BigDecimal;
import java.sql.Date;

import prog.ud10.ejercicios.EventoMusical.Genero;

public class Main {

	public static void main(String[] args) {
		// Ejercicio 1
		EventoMusical conciertoEstopa = new EventoMusical("Latino", 
				new Date(2026, 7, 12), new BigDecimal(10000),
				Genero.POP);
		// Ejercicio 2
		Artista estopa = new Artista();
		estopa.setNombre("Estopa");
		estopa.setPais("España");
		conciertoEstopa.agregarArtista(estopa);
	}

}
