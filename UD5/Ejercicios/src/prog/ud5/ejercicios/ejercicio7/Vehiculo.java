package prog.ud5.ejercicios.ejercicio7;

public class Vehiculo {
	protected String marca;
	private String modelo;
	private int anio;
	
	Vehiculo(String marca, String modelo, int anio) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}
	
	Vehiculo(){}
	
	public void mostrarDetalles() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Año: " + anio);
	}
	
	public void mover () {
		
	}
	
	public String getMarca() {
		return marca;
	}
}
