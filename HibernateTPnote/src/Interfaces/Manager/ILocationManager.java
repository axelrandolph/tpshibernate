package Interfaces.Manager;

import exceptions.LocationException;
import model.EntityBoat;

import model.EntityLocation;

public interface ILocationManager {
	
	public EntityLocation createLocation(int size, int idDock) throws LocationException;
	
	public void attachBoat(int idLocation, int idBoat) throws LocationException;
	
	public void deleteLocation(int idLocation) throws LocationException;
	
	
}
