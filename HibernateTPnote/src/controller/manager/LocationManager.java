package controller.manager;

import Interfaces.DAO.IBoatDAO;
import Interfaces.DAO.IDockDAO;
import Interfaces.DAO.ILocationDAO;
import Interfaces.Manager.ILocationManager;
import exceptions.LocationException;
import model.EntityBoat;
import model.EntityDock;
import model.EntityLocation;
import model.EntitySailBoat;

public class LocationManager implements ILocationManager {

	private ILocationDAO locationDAO;
	private IDockDAO dockDAO;
	private IBoatDAO boatDAO;
	
	
	@Override
	public EntityLocation createLocation(int size, int idDock) throws LocationException {
		
		checkSize(size);
		EntityDock dock = dockDAO.getById(idDock);
		EntityLocation location = new EntityLocation(size, dock);
		locationDAO.create(location);

		return location;
	}
	
	@Override
	public void attachBoat(int idLocation, int idBoat) {
		
		EntityLocation location = locationDAO.getById(idLocation);
		EntityBoat boat = boatDAO.getById(idBoat);
		location.setBoat(boat);
		locationDAO.update(location);
	}

	@Override
	public void deleteLocation(int idLocation) {
		
		EntityLocation location = locationDAO.getById(idLocation);
		locationDAO.delete(location);

	}
	
	
	private void checkSize(int size) throws LocationException {
		if(size > 200) {
			throw new LocationException("Size is too much");
		}
	}


}
