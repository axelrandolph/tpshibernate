package controller.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Interfaces.DAO.ILocationDAO;
import model.EntityBoat;
import model.EntityLocation;
import model.EntitySailBoat;

public class LocationDAO extends DAO<EntityLocation> implements ILocationDAO {

	public LocationDAO(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void delete(EntityLocation entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public EntityLocation getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EntityLocation> getAll() {
		List<EntityLocation> listLocation = null;
		Query query = em.createQuery("select * from EntityLocation");
		listLocation = query.getResultList();
		
		return listLocation;
	}

}
