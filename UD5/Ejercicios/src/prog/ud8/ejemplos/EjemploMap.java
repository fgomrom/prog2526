package prog.ud8.ejemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploMap {

	public static void main(String[] args) {
		Map <Integer, String> m = new HashMap<>();
		m.put(123, "Teclado");
		m.put(234, "Monitor");
		m.put(451, "Torre");
		m.put(123, "Ratón");
		/*m.remove(451);
		m.replace(234, "Pantalla");
		System.out.println(m);
		System.out.println(m.get(123));
		System.out.println(m.get(1));
		System.out.println("Recorrido for-each:");*/
		
		Set<Integer> claves = m.keySet();
		
		for(Integer k: claves) {
			System.out.println(m.get(k));
		}
	}

}
