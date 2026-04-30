package prog.ud8.examen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio2 {

	public static void main(String[] args) {
		List<Integer> codigos = new ArrayList<>(Arrays.asList(41325,123,9605));
		filtrarCodigos(codigos);
	}
	
	private static Set<Integer> filtrarCodigos(Collection<Integer> codigosEntrada) {
	    // El constructor de HashSet puede recibir otra colección y elimina duplicados automáticamente
	    return new HashSet<>(codigosEntrada);
	}

}
