package prog.ud5.ejercicios.ejercicio7;

public class Main {
	public static void main (String [] args) {
		Vehiculo v = new Vehiculo("Seat", "600", 2000);
		//v.mostrarDetalles();
		
		Vehiculo c = new Coche("Peogot", "2626", 2018, 5);
		c.mover();
		
		Vehiculo m = new Moto();
		m.mover();
		
	}
}
