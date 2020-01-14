package controller.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import Interfaces.DAO.IDAO;
import exceptions.OwnerException;
import model.EntityOwner;

	
	
public abstract class DAO<T> implements IDAO<T>{
 
	@PersistenceContext
	protected  EntityManager em;
	
	public DAO(EntityManager em) {
		this.em = em;
	}
	
	public DAO() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateTPnote");
		em = emf.createEntityManager();
	}
	
	
	

	@Override
	public T update(T entity) {
		em.getTransaction().begin();
		em.merge(entity);
		em.getTransaction().commit();
		return entity;
		
	}

	@Override
	public T create(T entity) throws Exception {
		
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		return entity;
	}

	@Override
	public abstract void delete(T entity) throws Exception;

	@Override
	public abstract T getById(int id) throws Exception;

	@Override
	public abstract List<T> getAll();

	
	

}
