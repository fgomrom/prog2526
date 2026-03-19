package prog.ud6.ejercicios.ejercicio1;

public class Perro extends Animal implements Corredor {

	@Override
	public void correr() {
		System.out.println("Corre a cuatro patas");
	}

}
