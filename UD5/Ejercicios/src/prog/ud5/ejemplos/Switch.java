package prog.ud5.ejemplos;

public class Switch {
    public static void main(String[] args) {
       int a = 5;

        switch(a) {
            case 1,5,7: 
                System.out.println("primero");
                break;
            case 2: 
                System.out.println("segundo");
                break;
            case 3: 
                System.out.println("tercero");
                break;
            default: 
                System.out.println("otros");
                break;
        } 
    }
    
    
}
