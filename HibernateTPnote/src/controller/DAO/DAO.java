package controller.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import Interfaces.DAO.IDAO;

	
	
public abstract class DAO<T> implements IDAO<T>{
 
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateTPnote");
	//EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateTPnote");
	@PersistenceContext
	protected  EntityManager em;
	
	public DAO(EntityManager em) {
		this.em = em;
	}
	
	public DAO() {
		emf = Persistence.createEntityManagerFactory("HibernateTPnote");
		em = emf.createEntityManager();
	}
	
	
	public abstract T create(T entity);


	public abstract void delete(T entity);

	public abstract void deleteById(int entityId);
	
	public abstract T searchById(int id);

	public abstract List<T> getAll();

	
	

}
