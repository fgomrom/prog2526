package prog.ud6.ejercicios.ejercicio2;

public class Pajaro extends AnimalBase implements Animal, Volador {

	public Pajaro(String nombre) {
		super(nombre);
	}

	@Override
	public void volar() {
		System.out.println("Vuela");
	}

	@Override
	public void hacerSonido() {
		System.out.println("Pio");
	}

	@Override
	public void comer() {
		System.out.println("Alpiste");
	}
	
}
