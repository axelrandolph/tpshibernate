package controller.manager;

import Interfaces.DAO.ILocationDAO;
import Interfaces.Manager.ILocationManager;
import model.EntityBoat;
import model.EntityLocation;

public class LocationManager implements ILocationManager {

	private ILocationDAO locationDAO;
	@Override
	public EntityLocation CreateLocation(int size, EntityBoat boat) {
		
		EntityLocation entityLocation = new EntityLocation();
		
		return entityLocation;
	}

	@Override
	public void DeleteLocation(EntityLocation location) {

	}

}
