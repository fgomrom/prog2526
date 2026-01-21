package prog.ud5.ejercicios.ejercicio2;
import prog.ud4.ejercicios.ejercicio2.DiaDeLaSemana;

public class Persona {
	// Atributos
	private String nombre;
	private String apellido;
	private int edad;
	private float estatura;
	private DiaDeLaSemana dia;
	private Sexo sexo;

	// Constructores
	Persona(String nombre, String apellido, int edad, float estatura, Sexo sexo) {
		this(nombre, apellido, edad, estatura);
		this.sexo = sexo;
	}
	
	Persona(String nombre, String apellido, int edad, float estatura) {
		this(nombre + " " + apellido, edad, estatura);
		this.apellido = apellido;
	}
	
	Persona(String nombre, int edad, float estatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}
	
	Persona(String nombre) {
		this.nombre = nombre;
	}
	
	Persona(int edad) {
		this.edad = edad;
	}
	
	Persona() {
		this.nombre ="anónino";
	}

	// Métodos
	void saludar() {
		System.out.println("Hola!");
	}
	
	void cumplirAnios() {
		edad++;
	}
	
	void crecer(int incremento) {
		estatura += incremento;
	}
	
	public enum Sexo {
		MASCULINO, FEMENINO, NO_BINARIO
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	
	public void setSexo(Sexo s) {
		this.sexo = s;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad >= 0) {
			this.edad = edad;
		}
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	public DiaDeLaSemana getDia() {
		return dia;
	}

	public void setDia(DiaDeLaSemana dia) {
		this.dia = dia;
	}
	
	
}


