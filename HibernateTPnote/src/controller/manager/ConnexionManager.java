package controller.manager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnexionManager {
	
	protected EntityManager em; 
	
	public ConnexionManager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateTPnote");
		em = emf.createEntityManager();
	}

}
