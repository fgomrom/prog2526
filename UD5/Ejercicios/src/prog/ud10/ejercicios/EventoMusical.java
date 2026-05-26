package prog.ud10.ejercicios;

import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Entity;

@Entity(name = "Evento")
public class EventoMusical {
	private String nombre;
	private Date fecha;
	private BigDecimal recaudacion;
	public EventoMusical(String nombre, Date fecha, BigDecimal recaudacion) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.recaudacion = recaudacion;
	}
	
	
}
