package prog.ud5.ejercicios.ejercicio2;

import prog.ud5.ejercicios.ejercicio2.Persona.Sexo;

public class Ciudad {
	public static void main(String[] args) {

		Persona juan = new Persona("Juan", "Pérez", 20, 1.8f, Persona.Sexo.MASCULINO);
		juan.setEdad(1);
		System.out.println(juan.getEdad());
	}
}
