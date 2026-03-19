package prog.ud6.ejercicios.ejercicio2;

public class Vaca extends AnimalBase implements Animal, Volador {

	public Vaca(String nombre) {
		super(nombre);
	}
	
	@Override
	public void hacerSonido() {
		System.out.println("Muu");		
	}
	@Override
	public void comer() {
		System.out.println("come hierba");
	}

	@Override
	public void volar() {
		System.out.println("se cae");
	}
}
