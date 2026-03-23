package prog.ud6.ejercicios.ejercicio3;

public class Main {

	public static void main(String[] args) {
		int total = 0;
		Vehicle v1 = new Car("co","asdf",1111,FuelType.DIESEL,3); // No puedo instanciar clases abstractas ni interfaces
		Vehicle v2 = new Car("co","asdf",1112,FuelType.DIESEL,3); // No puedo instanciar clases abstractas ni interfaces
		Vehicle v3 = new Car("co","asdf",1113,FuelType.DIESEL,3); // No puedo instanciar clases abstractas ni interfaces
		Vehicle v4 = new Car("co","asdf",1114,FuelType.DIESEL,3); // No puedo instanciar clases abstractas ni interfaces
		Vehicle v5 = new Car("co","asdf",1115,FuelType.DIESEL,3); // No puedo instanciar clases abstractas ni interfaces
		Vehicle v6 = new Car("co","asdf",1116,FuelType.DIESEL,3); // No puedo instanciar clases abstractas ni interfaces
		System.out.println(v1.getTotalVehicles());
		System.out.println(v1);
		v1.equals(v2);
	}

}
