package prog.ud5.ejemplos;
import java.util.Random;

public class EjemploBucleAnidadoDependiente {
	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt();
		int i,j;
		for (i = 1; i <= 3; i++) {
			System.out.println("Bucle externo, i= " + i);
			j = 1;
			while (j <= i) {
				System.out.println("...Bucle interno, j=" + j);
				j++;
			}
		}
	}

}
