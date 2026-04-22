package prog.ud8.ejemplos;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class EjemploIterator {

	public static void main(String[] args) {
		Set<String> s = new LinkedHashSet<>();
		s.add("Hola");
		s.add("Hola1");
		s.add("Hola3");
		s.add("Hola2");
		
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
