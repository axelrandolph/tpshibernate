package controller.manager;

import Interfaces.DAO.ILocationDAO;
import Interfaces.Manager.ILocationManager;
import model.EntityBoat;
import model.EntityLocation;
import model.EntitySailBoat;

public class LocationManager implements ILocationManager {

	private ILocationDAO locationDAO;
	@Override
	public EntityLocation CreateLocationSail(int size, String nameBoat) {
		
		EntitySailBoat sailBoat = new EntitySailBoat();
		sailBoat.setName(nameBoat);
		
		EntityLocation entityLocation = new EntityLocation(size,sailBoat.getName());

		return entityLocation;
	}

	public EntityLocation CreateLocationMotor(int size, String nameBoat) {
		
		
		
		EntityLocation entityLocation = new EntityLocation();

		return entityLocation;
	}
	
	@Override
	public void DeleteLocation(EntityLocation location) {

	}

}
