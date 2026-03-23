package prog.ud6.ejercicios.ejercicio3;

public class Car extends Vehicle {
	
	private int numberOfDoors;
	
	public Car(String licensePlate, String brand, int year, FuelType fuelType, int numberOfDoors) {
		super(licensePlate, brand, year, fuelType);
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public double calculateSpeed() {
		return 0;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

}
