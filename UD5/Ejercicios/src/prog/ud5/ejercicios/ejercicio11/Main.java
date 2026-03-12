package prog.ud5.ejercicios.ejercicio11;

public class Main {

	public static void main(String[] args) {
		Libro elQuijoteAntiguo = new Libro("El Quijote","Cervantes","11111",1885);
		Libro elQuijoteNuevo = new Libro("El Quijote","Cervantes","11111",1885);
		Libro elPrincipito = new Libro("El Principito","Pepito","22222",1910);
		System.out.println(elQuijoteAntiguo);
		System.out.println(elPrincipito.equals(elPrincipito));
		Libro[] libreria = new Libro[10];
		libreria[0] = elQuijoteAntiguo;
		libreria[0] = elQuijoteNuevo;
		int repetidos = 0;
		for (Libro libro : libreria) {
			if (libro.equals(libreria[0]))
				repetidos ++;
		}
	}

}
