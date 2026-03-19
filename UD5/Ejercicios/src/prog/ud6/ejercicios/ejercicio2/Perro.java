package prog.ud6.ejercicios.ejercicio2;

public class Perro extends AnimalBase implements Animal {
	@Override
	public void hacerSonido() {
		System.out.println("Guau");
	}
	
	public Perro(String nombre) {
		super(nombre);
	}

	@Override
	public void comer() {
		System.out.println("come carne");
	}
}
