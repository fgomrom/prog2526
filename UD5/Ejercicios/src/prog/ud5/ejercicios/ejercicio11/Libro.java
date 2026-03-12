package prog.ud5.ejercicios.ejercicio11;

public class Libro {
	private String titulo;
	private String autor;
	private String isbn;
	private int anioPublicacion;
	
	public Libro(String titulo, String autor, String isbn, int anioPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.anioPublicacion = anioPublicacion;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		if (titulo != "")
			this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	@Override
	public boolean equals(Object obj) {
		return this.isbn == ((Libro)obj).isbn;
	}
	
	@Override
	public String toString() {
		return "Titulo: [ " + titulo + " ], Autor: [ " + autor + " ]";
	}
	
}
