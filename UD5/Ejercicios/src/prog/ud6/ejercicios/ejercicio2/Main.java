package prog.ud6.ejercicios.ejercicio2;

public class Main {

	public static void main(String[] args) {
		
		Perro p1 = new Perro("p1");
		Gato g1 = new Gato("g1");
		Perro p2 = new Perro("p2");
		Vaca v1 = new Vaca("v1");
		Vaca v2 = new Vaca("v2");
		Pajaro pa1 = new Pajaro("pa1");
		
		Animal[] animales = new Animal[6];
		animales[0] = p1;
		animales[1] = v1;
		animales[2] = g1;
		animales[3] = p2;
		animales[4] = v2;
		animales[5] = pa1;
		
		for (Animal animal : animales) {
			if (animal instanceof Volador)
				((Volador) animal).volar();
			AnimalBase animalBase = (AnimalBase)animal;
			animalBase.mostrarNombre();
			animal.hacerSonido();
			animal.comer();
		}
	}

}
