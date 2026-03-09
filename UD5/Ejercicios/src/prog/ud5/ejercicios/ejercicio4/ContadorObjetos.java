package prog.ud5.ejercicios.ejercicio4;

class ContadorObjetos {
	static int totalObjetos = 0;
	
	ContadorObjetos() {
		totalObjetos += 1;
	}
	
	static void mostrarTotalObjetos() {
		System.out.println(totalObjetos);
	}
}
