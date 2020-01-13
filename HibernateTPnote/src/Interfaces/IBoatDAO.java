package Interfaces;

import model.EntityDock;
import model.EntityOwner;

public interface IBoatDAO{

	int countBoatByDock(EntityDock dock);
	
	void insertBoat(EntityDock dock, String name, float weight, EntityOwner owner);

}
