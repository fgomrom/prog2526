package prog.comunes;

public class Persona implements Comparable<Persona>{
	// Atributos
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona() {
		
	}
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public Persona(String nombre, String apellido, int edad) {
		super();
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
