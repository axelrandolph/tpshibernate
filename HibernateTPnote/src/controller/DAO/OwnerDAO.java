package controller.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import Interfaces.DAO.IOwnerDAO;
import model.EntityOwner;
import javax.persistence.Query;

public class OwnerDAO extends DAO<EntityOwner> implements IOwnerDAO {

	public OwnerDAO(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	@Override
	public EntityOwner create(EntityOwner entity) {
		
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		
		return entity;
	}


	@Override
	public void delete(EntityOwner entity) {

		try {
			EntityOwner owner = em.find(EntityOwner.class, entity.getIdOwner());
			em.remove(owner);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteById(int entityId) {
		try {
			EntityOwner owner = em.find(EntityOwner.class, entityId);
			em.remove(owner);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public EntityOwner getById(int idOwner) {
		try {
			EntityOwner owner = em.find(EntityOwner.class, idOwner);
			return owner;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public List<EntityOwner> getAll() {
		
		List<EntityOwner> listOwner = new ArrayList<EntityOwner>();
		
		try {
			Query query = em.createQuery("from entityowner");
			listOwner = query.getResultList();
			return listOwner;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	
}
