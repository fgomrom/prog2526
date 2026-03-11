package prog.ud5.ejemplos.object;

import prog.comunes.Persona;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Persona(null, 20);
		Persona p2 = new Persona("David", 20);
		System.out.println(p1.equals(p1));
	}

}
