package prog.ud8.ejemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjemploCollections {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		List<Integer> l2 = new ArrayList(l);
		System.out.println(l);
		System.out.println("l2"+l2);
		Collections.shuffle(l);
		System.out.println(l);
		System.out.println("l2"+l2);
		
	}

}
