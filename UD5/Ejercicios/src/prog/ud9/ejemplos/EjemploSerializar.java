package prog.ud9.ejemplos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

import prog.comunes.Persona;

public class EjemploSerializar {

	public static void main(String[] args) {
        // 1. Crear objeto
        Persona miPersona = new Persona("Fran", "Gómez", 30, LocalDate.of(1995, 5, 10), "1234", new Object());

        // 2. Guardar en fichero
        try {
            FileOutputStream fichero = new FileOutputStream("persona.dat");
            ObjectOutputStream out = new ObjectOutputStream(fichero);

            out.writeObject(miPersona);

            out.close();

            System.out.println("Persona guardada correctamente");

        } catch (IOException e) {
            System.out.println("Error al guardar");
        }
        
        try {
	        // 1. Abrir el fichero
	        FileInputStream fichero = new FileInputStream("persona.dat");
	        
	        // 2. Crear el flujo de lectura de objetos
	        ObjectInputStream in = new ObjectInputStream(fichero);
	        
	        // 3. Leer el objeto (hay que hacer casting)
	        Persona p = (Persona) in.readObject();
	        
	        // 4. Cerrar flujo
	        in.close();
	
	        // 5. Mostrar resultado
	        System.out.println("Persona leída:");
	        System.out.println(p);

	    } catch (IOException e) {
	        System.out.println("Error de entrada/salida");
	    } catch (ClassNotFoundException e) {
	        System.out.println("Clase no encontrada");
	    }
	}

}
