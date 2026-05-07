package prog.ud9.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Inicializamos nuestro "traductor"
        Scanner sc = new Scanner(System.in);

        // 2. Pedimos la edad (Número entero)
        System.out.print("¿Cuántos años crees que vivirás?: ");
        int edadDeseada = sc.nextInt();
        sc.nextLine();
        
        // 1. Pedimos el nombre (Cadena de texto)
        System.out.print("¿Cuál es tu nombre, mortal?: ");
        String nombre = sc.nextLine();
        
        // --- TRUCO DE PROFE ---
        // Limpiamos el buffer porque nextInt() dejó el "Intro" dentro.
        //sc.nextLine(); 
        // ----------------------

        // 3. Predicción final
        int edadFinal = edadDeseada + 10;
        
        System.out.println("\n--- 📜 TU DESTINO ESTÁ ESCRITO 📜 ---");
        System.out.println("Escucha bien, " + nombre + "...");
        System.out.println("Los astros dicen que vivirás hasta los " + edadFinal + " años.");
        System.out.println("Tu fin llegará por culpa de un café frío y un código sin comentar.");
        
        sc.close();
	}

}
