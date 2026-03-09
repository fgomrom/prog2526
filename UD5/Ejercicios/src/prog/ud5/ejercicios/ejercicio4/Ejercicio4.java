package prog.ud5.ejercicios.ejercicio4;

public class Ejercicio4 {

	public static void main(String[] args) {
		ContadorObjetos contador1 = new ContadorObjetos();
		ContadorObjetos contador2 = new ContadorObjetos();
		ContadorObjetos contador3 = new ContadorObjetos();
		
		contador3.totalObjetos = 0;
		contador3.mostrarTotalObjetos();
		contador1.mostrarTotalObjetos();
		contador2.mostrarTotalObjetos();
		
		ContadorObjetos.mostrarTotalObjetos();
		
		String s;
	}

}
