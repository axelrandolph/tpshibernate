package controller.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import Interfaces.DAO.IOwnerDAO;
import exceptions.OwnerException;
import model.EntityOwner;
import javax.persistence.Query;

public class OwnerDAO extends DAO<EntityOwner> implements IOwnerDAO {

	public OwnerDAO(EntityManager em) {
		super(em);
	}


	@Override
	public void delete(EntityOwner entity) throws Exception {
		
		EntityOwner owner = em.find(EntityOwner.class, entity.getIdOwner());
		if(owner == null) {
			throw new Exception("Impossible de récupérer le propriétaire de cet identifiant");
		}
		em.remove(owner);
		
	}

	@Override
	public EntityOwner getById(int idOwner) throws Exception {
		EntityOwner owner = null;
		owner = em.find(EntityOwner.class, idOwner);
		if (owner == null) {
			throw new Exception("aucun propriétaire de trouver avec cet identifiant");
		}
		return owner;
	}

	@Override
	public List<EntityOwner> getAll() {
		
		List<EntityOwner> listOwner = null;
		Query query = em.createQuery("select * from entityowner");
		listOwner = query.getResultList();
		
		return listOwner;
	}


	
}
