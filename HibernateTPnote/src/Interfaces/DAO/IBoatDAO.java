package Interfaces.DAO;

import model.EntityBoat;
import model.EntityDock;
import model.EntityOwner;

public interface IBoatDAO extends IDAO<EntityBoat>{

	int countBoatByDock(EntityDock dock);
	
	void insertBoat(EntityDock dock, String name, float weight, EntityOwner owner);

}
