package prog.ud8.ejercicios;

import java.util.ArrayList;
import java.util.ListIterator;

public class Ejercicio12 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		numeros.add(50);
		numeros.add(60);
		numeros.add(70);
		numeros.add(80);
		numeros.add(90);
		numeros.add(100);
		
		ListIterator<Integer> it = numeros.listIterator();
		while(it.hasNext()) {
			Integer num = it.next();
			if (num > 50) {
				it.set(num * 2);
			}
			int indice = it.nextIndex();
			System.out.print(indice + " - ");
			System.out.println(numeros.get(indice - 1));
		}
		
		while(it.hasPrevious()) {
			Integer num = it.previous();
			if (num < 30) {
				it.add(25);
				it.previous();
			}
		}
		System.out.println(numeros);
		
		

	}

}
