package prog.comunes;

import java.io.Serializable;
import java.time.LocalDate;

public class Persona implements Comparable<Persona>, Serializable{
	private static final long serialVersionUID = 1L;
	
	// Atributos
	private String nombre;
	private String apellido;
	private int edad;
	private LocalDate fecha;
	// No se serializa (aunque sea serializable)
    private transient String password;
    // No serializable (Object no implementa Serializable)
    // Debe ser transient para evitar error
    private transient Object conexion;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona() {
		
	}
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public Persona(String nombre, String apellido, int edad, LocalDate fecha, String password, Object conexion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fecha = fecha;
		this.password = password;
		this.conexion = conexion;
	}

	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return nombre + " " + apellido + " - " + edad;
	}

	@Override
	public boolean equals(Object obj) {
		return this.nombre.equals(((Persona) obj).nombre) &&
				this.edad == ((Persona) obj).edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		if (edad < 0) {
			throw new EdadInvalidaException("Edad negativa");
		}
		this.edad = edad;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public int compareTo (Persona p) {
		return this.getNombre().compareTo(p.getNombre());
	}
}
