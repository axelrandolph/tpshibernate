package Model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	
	public static void main(String argv[]) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateTPnote");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.getTransaction().commit();
		
	}

}
