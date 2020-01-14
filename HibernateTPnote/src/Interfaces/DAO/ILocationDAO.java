package Interfaces.DAO;

import model.EntityBoat;
import model.EntityLocation;

public interface ILocationDAO extends IDAO<EntityLocation> {

	public EntityLocation create(EntityLocation entity);
}
