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
		EntityDock dock;
		EntityLocation location = null;
		try {
			dock = dockDAO.getById(idDock);
			location = new EntityLocation(size, dock);
			locationDAO.create(location);
		} catch (Exception e) {
			throw new LocationException(e.getMessage());

		}
		

		return location;
	}
	
	@Override
	public void attachBoat(int idLocation, int idBoat) throws LocationException {
		
		EntityLocation location;
		EntityBoat boat; 
		
		try {
			location = locationDAO.getById(idLocation);
			boat = boatDAO.getById(idBoat);
			location.setBoat(boat);
			locationDAO.update(location);
		} catch (Exception e) {
			throw new LocationException(e.getMessage());
		}
		
	}

	@Override
	public void deleteLocation(int idLocation) throws LocationException {
		
		EntityLocation location;
		try {
			location = locationDAO.getById(idLocation);
			locationDAO.delete(location);
		} catch (Exception e) {
			throw new LocationException(e.getMessage());
		}
		

	}
	
	
	private void checkSize(int size) throws LocationException {
		if(size > 200) {
			throw new LocationException("Size is too much");
		}
	}


}
