package Interfaces.DAO;

import model.EntityBoat;
import model.EntityLocation;

public interface ILocationDAO {

	public EntityLocation insertLocation(int size, EntityBoat boat);
	public void deleteDock(EntityLocation location);
}
