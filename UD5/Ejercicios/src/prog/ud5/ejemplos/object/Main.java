package prog.ud5.ejemplos.object;

import prog.comunes.Persona;

public class Main {

	public static void main(String[] args) {
		Persona fran = new Persona();
		fran.setNombre("Fran Gómez");
		System.out.println(fran);
		fran.toString();
	}

}
