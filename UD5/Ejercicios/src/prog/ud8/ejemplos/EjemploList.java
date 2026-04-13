package prog.ud8.ejemplos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EjemploList {

	public static void main(String[] args) {
		List listaSecuencial = new ArrayList();
		listaSecuencial.add(7);
		listaSecuencial.add(2);
		listaSecuencial.add(7);
		listaSecuencial.add(5);
		System.out.println(listaSecuencial);
		
		LinkedList listaEnlazada = new LinkedList();
		
		int[] array = new int[4];
		array[0] = 7;
		array[1] = 2;
		array[2] = 7;
		array[3] = 5;
		System.out.println(array);
	}

}
