package prog.ud5.ejercicios.ejercicio12;

public abstract class Animal {
	protected String nombre;
	protected int edad;
	
	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void mostrarInformacion() {
		
	}
	
	public abstract void hacerSonido();
	
	public abstract String moverse();
	
}
