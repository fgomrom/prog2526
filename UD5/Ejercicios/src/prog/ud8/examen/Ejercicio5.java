package prog.ud8.examen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Ejercicio5 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>(Arrays.asList(10,20,30));
		limpiarColeccion(numeros, 20);
		System.out.println(numeros);
	}
	
	private static void limpiarColeccion(Collection<Integer> coleccion, Integer umbral) {
	    Iterator<Integer> it = coleccion.iterator();
	    while (it.hasNext()) {
	        if (it.next() < umbral) {
	            it.remove(); // Única forma segura de borrar durante el recorrido
	        }
	    }
	}

}
