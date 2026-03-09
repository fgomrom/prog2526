package prog.ud5.ejemplos.polimorfismo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Animal a;
		
		Scanner sc = new Scanner(System.in);
		int tipo = sc.nextInt();
		
		switch (tipo) {
		case 1: 
			a = new Perro();
			break;
		case 2:
			a = new Gato();
			break;
		default:
			a = new Animal();
		} 
		
		a.hacerSonido();
	}

}
