package prog.ud4.ejercicios.ejercicio1;

public class Persona {
	// Atributos
	String nombre;
	int edad;
	float estatura;

	// Métodos
	void saludar() {
		System.out.println("Hola!");
	}
	
	void cumplirAnios() {
		edad++;
	}
	
	void crecer(int incremento) {
		estatura += incremento;
	}
}
