package prog.ud8.ejemplos.listas;

import java.util.ArrayList;
import java.util.List;

public class EjemploList {

	public static void main(String[] args) {
		List lista = new ArrayList();
		lista.add(7);
		lista.add(2);
		lista.add(7);
		lista.add(5);
		System.out.println(lista);
		
		int[] array = new int[4];
		array[0] = 7;
		array[1] = 2;
		array[2] = 7;
		array[3] = 5;
		System.out.println(array);
	}

}
