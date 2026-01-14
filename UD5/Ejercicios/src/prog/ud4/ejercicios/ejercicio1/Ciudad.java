package prog.ud4.ejercicios.ejercicio1;

public class Ciudad {
	public static void main (String[] args) {
		
		Persona juan = new Persona("Juan", "Pérez", 20, 1.8f, Persona.Sexo.MASCULINO);
		//p.sexo = Sexo.MASCULINO;
		System.out.println(juan.nombre);
		System.out.println(juan.apellido);
		System.out.println(juan.edad);
		System.out.println(juan.estatura);
		System.out.println(juan.sexo);
		
		
		
		// Declaro la variable juan de tipo Persona
		//Persona juan;
		// Inicializo juan con un nuevo objeto de tipo Persona
		//juan = new Persona("Juan");
		//juan.nombre = "Juan";
		//juan.edad = 20;
		//juan.estatura = 1.80f;
		
		Persona jose = new Persona();
		Persona miguel = new Persona();
		
		// Imprimer referencia
		System.out.println(juan);
		// Imprimir: Hola soy [juan] y tengo [20] años
		System.out.println("Hola soy " + juan.nombre + " y tengo " + juan.edad + " años");
		
	}
}
