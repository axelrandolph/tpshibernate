package controller.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO {
 
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateTPnote");
	EntityManager em = emf.createEntityManager();
}
