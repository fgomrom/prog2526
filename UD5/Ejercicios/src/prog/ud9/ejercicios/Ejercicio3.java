package prog.ud9.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// 1. Preparamos el Scanner
        Scanner sc = new Scanner(System.in);

        // 2. Instrucciones para el usuario
        System.out.println("Introduzca varios caracteres y después pulse Intro para finalizar:");
        
        // 3. El usuario introduce datos (esto queda guardado en el buffer)
        String entradaPrueba = sc.nextLine(); 
        System.out.println("Has escrito: " + entradaPrueba);
        System.out.println("------------------------------------");

        // 4. El "Hola Mundo" personalizado
        System.out.println("Introduzca su nombre:");
        
        // El programa se para aquí hasta que el usuario escriba y pulse Intro
        String nombre = sc.nextLine(); 
        
        System.out.println("¡Hola " + nombre + "!");

        // 5. Cerramos el flujo
        sc.close();
	}

}
