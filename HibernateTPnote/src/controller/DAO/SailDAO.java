package controller.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Interfaces.DAO.IBoatDAO;
import Interfaces.DAO.ISailDAO;
import model.EntityBoat;
import model.EntityDock;
import model.EntityOwner;
import model.EntitySailBoat;

public class SailDAO extends DAO<EntitySailBoat> implements ISailDAO{

	public SailDAO(EntityManager em) {
		super(em);
	}


	@Override
	public void delete(EntitySailBoat entity) throws Exception {
		EntityOwner sailboat = em.find(EntityOwner.class, entity.getIdBoat());
		if(sailboat == null) {
			throw new Exception("Impossible de récupérer le propriétaire de cet identifiant");
		}
		em.remove(sailboat);
	}


	@Override
	public EntitySailBoat getById(int id) throws Exception {
		EntitySailBoat sailboat = null;
		sailboat = em.find(EntitySailBoat.class, id);
		if (sailboat == null) {
			throw new Exception("aucun propriétaire de trouver avec cet identifiant");
		}
		return sailboat;
	}

	@Override
	public List<EntitySailBoat> getAll() {

		List<EntitySailBoat> listSailBoat = null;
		Query query = em.createQuery("select * from entitysailboat");
		listSailBoat = query.getResultList();
		
		return listSailBoat;
		
	}
	
	

}
