package prog.ud8.examen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio1 {

	public static void main(String[] args) {
		List<String> nombres = new ArrayList<>(Arrays.asList("Fran","Juan","Ana"));
		System.out.println(pacienteEnPosicion(nombres));
	}
	
	private static String pacienteEnPosicion(List<String> nombres) {
		return nombres.getLast();
	}

}
