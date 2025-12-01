package netbeans;

import java.util.Scanner;

/**
 *
 * @author Fran Gómez
 */
public class Netbeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo!");
        java.time.LocalTime hora = java.time.LocalTime.now();
        System.out.println("La hora es: " + hora);
        
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextDouble();
        System.out.println("Número: " + numero);
    }
    
}
