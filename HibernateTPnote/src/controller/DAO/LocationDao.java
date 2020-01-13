package controller.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import Interfaces.DAO.ILocationDAO;
import model.EntityBoat;
import model.EntityLocation;

public class LocationDao extends DAO<EntityLocation> implements ILocationDAO {

	public LocationDao(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	@Override
	public EntityLocation create(EntityLocation entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(EntityLocation entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int entityId) {
		// TODO Auto-generated method stub
	}

	@Override
	public EntityLocation searchById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EntityLocation> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


/*	@Override
	public EntityLocation insertLocation(int size, EntityBoat boat) {

		EntityLocation location = new EntityLocation();
		location.setSize(size);
		location.setBoat(boat);
		
		em.getTransaction().begin();
		em.persist(location);
		em.getTransaction().commit();
		
		return location;
	}

	@Override
	public void deleteDock(EntityLocation location) {

		location = em.find(EntityLocation.class, location.getCode());
		em.getTransaction().begin();
		em.remove(location);
		em.getTransaction().commit();
	}
*/
}
