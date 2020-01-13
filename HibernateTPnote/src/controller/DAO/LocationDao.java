package controller.DAO;

import Interfaces.DAO.ILocationDAO;
import model.EntityBoat;
import model.EntityLocation;

public class LocationDao extends DAO implements ILocationDAO {

	@Override
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

}
