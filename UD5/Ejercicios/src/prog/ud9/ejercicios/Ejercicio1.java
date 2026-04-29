package prog.ud9.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce 4 caracteres (puedes escribirlos seguidos):");
        String entrada = sc.next(); // Leemos lo que escriba el usuario
        
        // Guardamos cada uno en una variable tipo char (carácter)
        char c1 = entrada.charAt(0);
        char c2 = entrada.charAt(1);
        char c3 = entrada.charAt(2);
        char c4 = entrada.charAt(3);

        // 1. System.out.write -> El nivel "bajo" (Binario)
        // Escribe el byte directamente. ¡Ojo! Necesita un flush() para verse.
        System.out.write(c1); 
        System.out.flush(); 

        // 2. System.out.print -> El estándar
        // Pega el carácter a lo que venga después, sin saltar de línea.
        System.out.print(c2);

        // 3. System.out.println -> El cómodo
        // Escribe el carácter y salta a la siguiente línea automáticamente.
        System.out.println(c3);

        // 4. System.out.printf -> El elegante (Formateado)
        // Permite incrustar el carácter dentro de un texto usando moldes.
        System.out.printf("El último carácter es: %c", c4);
        
        sc.close();
	}

}
