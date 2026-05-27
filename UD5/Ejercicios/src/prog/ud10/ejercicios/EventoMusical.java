package prog.ud10.ejercicios;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

public class EventoMusical implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String nombre;
	private Date fecha;
	private BigDecimal recaudacion;
	
	public EventoMusical() {
		
	}
	
	public EventoMusical(String nombre, Date fecha, BigDecimal recaudacion) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.recaudacion = recaudacion;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
