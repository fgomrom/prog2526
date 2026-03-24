package prog.ud6.ejercicios.ejercicio3;

import java.util.Date;

public abstract class Vehicle implements Maintenance {
	private String licensePlate;
	private String brand;
	private int year;
	private FuelType fuelType;
	private static int vehicleCount;

	public Vehicle(String licensePlate, String brand, int year, FuelType fuelType) {
		this.licensePlate = licensePlate;
		this.brand = brand;
		this.year = year;
		this.fuelType = fuelType;
		vehicleCount++;
	}

	public Vehicle() {

	}

	public abstract double calculateSpeed();

	public String getVehicleInfo() {
		return "Licencia: " + licensePlate + ", marca: " + brand;
	}

	@Override
	public String nextMaintanceDate() {
		return String.valueOf(new Date()); // Ejemplo
	}

	public int getTotalVehicles() {
		return vehicleCount;
	}

	protected String getLicensePlate() {
		return licensePlate;
	}

	protected void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	protected String getBrand() {
		return brand;
	}

	protected void setBrand(String brand) {
		this.brand = brand;
	}

	protected int getYear() {
		return year;
	}

	protected void setYear(int year) {
		this.year = year;
	}

	protected FuelType getFuelType() {
		return fuelType;
	}

	protected void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}

	protected static int getVehicleCount() {
		return vehicleCount;
	}

	protected static void setVehicleCount(int vehicleCount) {
		Vehicle.vehicleCount = vehicleCount;
	}

	@Override
	public String toString() {
		return "Vehicle [licensePlate=" + licensePlate + ", brand=" + brand + ", year=" + year + ", fuelType="
				+ fuelType + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		else if (this.licensePlate.equals(((Vehicle) obj).licensePlate))
			return true;
		else {
			return false;
		}
	}

}
