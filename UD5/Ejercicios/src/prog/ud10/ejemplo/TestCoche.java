package prog.ud10.ejemplo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestCoche {

	public static void main(String[] args) {
		// Abrir conexión
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:$objectdb/db/coche.odb");
		EntityManager em = emf.createEntityManager();

		// Iniciar la transacción
		em.getTransaction().begin();

		// Operaciones
		Coche c1 = new Coche();
		Coche c2 = new Coche();

		c1.setColor("Rojo");
		c2.setColor("Verde");

		// Insert into
		em.persist(c1);
		em.persist(c2);

		// Finalizar la transacción: salvar la información
		em.getTransaction().commit();

		// Cerrar conexión
		em.close();
		emf.close();
	}

}
