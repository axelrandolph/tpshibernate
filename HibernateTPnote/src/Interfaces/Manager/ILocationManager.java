package Interfaces.Manager;

import model.EntityBoat;

import model.EntityLocation;

public interface ILocationManager {
	
	 EntityLocation CreateLocationSail(int size, String nameBoat);
		public EntityLocation CreateLocationMotor(int size, String nameBoat);

	 void DeleteLocation(EntityLocation location);

}
