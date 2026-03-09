package prog.ud5.ejercicios.ejercicio7;

public class Coche extends Vehiculo {
	private int numPuertas;
	
	Coche (String marca, String modelo, int anio, int numPuertas) {
		super(marca, modelo, anio);
		this.numPuertas = numPuertas;
	}
	
	public void mostrarDetalles() {
		super.mostrarDetalles();
		System.out.println("Nº puertas: " + numPuertas);
	}
	
	public void mover() {
		System.out.println("Me muevo con 4 ruedas");
	}
}
