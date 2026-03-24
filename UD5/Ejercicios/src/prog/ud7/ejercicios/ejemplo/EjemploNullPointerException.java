package prog.ud7.ejercicios.ejemplo;

import prog.comunes.Persona;

public class EjemploNullPointerException {

	public static void main(String[] args) {
		Persona fran = null;
		System.out.println(fran.nombre);
		System.out.println("Hol");
	}

}
