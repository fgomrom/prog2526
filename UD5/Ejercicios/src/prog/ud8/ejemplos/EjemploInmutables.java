package prog.ud8.ejemplos;

import java.util.ArrayList;
import java.util.List;

public class EjemploInmutables {

	public static void main(String[] args) {
		String s1 = "Hola";              // Va al Pool
		String s2 = "Hola";              // Referencia al mismo objeto en el Pool
		String s3 = new String("Hola");  // Se crea un objeto NUEVO en el Heap (fuera del Pool)

		System.out.println(s1 == s2);    // true
		System.out.println(s1 == s3);    // false
		
		
		String texto = "Hola";
        texto.concat(" mundo"); // Intentamos modificar el contenido

        System.out.println(texto); // Imprime: Hola

        // Guardamos el resultado en una nueva variable
        String nuevoTexto = texto.concat(" mundo");

        System.out.println(nuevoTexto); // Imprime: Hola mundo
        
        final List<String> lista = new ArrayList<>();
        lista.add("hola");
        System.out.println(lista);
        
	}

}
