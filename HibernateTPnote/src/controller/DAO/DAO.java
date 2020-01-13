package controller.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import Interfaces.DAO.IDAO;

public abstract class DAO<T> implements IDAO<T>{
 
	
	//EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateTPnote");
	@PersistenceContext
	protected  EntityManager em;
	
	public DAO(EntityManager em) {
		this.em = em;
	}
	
	
	public abstract T create(T entity);


	public abstract void delete(T entity);

	public abstract void deleteById(int entityId);
	
	public abstract T searchById(int id);

	public abstract List<T> getAll();

}
