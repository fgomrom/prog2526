package prog.ud10.ejercicios.ejercicio4;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

@Entity
public class EventoMusical implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "SecuenciaDe10en10", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "SecuenciaDe10en10", allocationSize = 10)
	private Long id;
	private String nombre;
	private Date fecha;
	private BigDecimal recaudacion;
	private Genero genero;
	private List<Artista> artistas;
	@Transient
	private int control;
	
	public enum Genero {
		ROCK, POP, CLASICO
	}
	
	public EventoMusical() {
		
	}
	
	public EventoMusical(String nombre, Date fecha, BigDecimal recaudacion, Genero genero) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.recaudacion = recaudacion;
	}

	public EventoMusical(String string, Date date, BigDecimal bigDecimal,
			prog.ud10.ejercicios.EventoMusical.Genero pop) {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getRecaudacion() {
		return recaudacion;
	}

	public void setRecaudacion(BigDecimal recaudacion) {
		this.recaudacion = recaudacion;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public void agregarArtista(Artista artista) {
		artistas.add(artista);
	}

}
