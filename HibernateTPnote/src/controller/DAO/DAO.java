package controller.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DAO {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateTPnote");
	EntityManager em = emf.createEntityManager();
	
	

}
