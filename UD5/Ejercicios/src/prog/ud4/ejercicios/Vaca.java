package prog.ud4.ejercicios;

public class Vaca {
	// Atributos
	String nombre;
	String color;
	boolean hambre = true;
	
	Vaca() {
		color = "blanco";
		nombre = "anonima";
	}
	
	Vaca(String nombre) {
		this.nombre = nombre;
	}
	
	// Métodos
	void comer() {
		hambre = false;
	}
	
	void mugir() {
		System.out.println("Muuuu!");
	}

}
