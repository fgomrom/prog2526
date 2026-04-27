package prog.ud8.ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EjemploListIterator {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("a");
		l.add("c");
		l.add("b");
		
		// Recorro hacia delante (el iterador se queda al final)
		ListIterator<String> lit = l.listIterator();
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
//		if (lit.hasNext()) {
//			System.out.println(lit.next());
//		}
		// Recorro hacia atrás, ya que el iterador está al final
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}

}
