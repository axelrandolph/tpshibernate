package Interfaces.Manager;

import model.EntityBoat;

import model.EntityLocation;

public interface ILocationManager {
	
	EntityLocation CreateLocation(int size, EntityBoat boat);

	 void DeleteLocation(EntityLocation location);

}
