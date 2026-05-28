package prog.ud10.ejercicios;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import prog.ud10.ejercicios.EventoMusical.Genero;

public class Main {

	public static void main(String[] args) {
		// Ejercicio 1
		EventoMusical conciertoEstopa = new EventoMusical("Latino", 
				new Date(2026, 7, 12), new BigDecimal(10000),
				Genero.POP);
		// Ejercicio 2
		Artista estopa = new Artista();
		estopa.setNombre("Estopa");
		estopa.setPais("España");
		conciertoEstopa.agregarArtista(estopa);
		
		// Ejercicio 4
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/eventos.odb");
		EntityManager em = emf.createEntityManager();
		
		//em.getTransaction().begin();
		
		/*em.persist(estopa);
		em.persist(conciertoEstopa);*/
		
		//em.getTransaction().commit();
		
		// Ejercicio 5
		EventoMusical concierto = em.find(EventoMusical.class, 31);
		System.out.println(concierto.getNombre());
		
		// Consulta
		
		
		em.close();
		emf.close();
		
		System.out.println("Finalizado correctamente");
		
	}

}
