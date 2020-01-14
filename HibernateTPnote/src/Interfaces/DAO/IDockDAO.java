package Interfaces.DAO;

import java.util.List;

import model.EntityDock;

public interface IDockDAO extends IDAO<EntityDock> {

	int countBoatByDock(EntityDock dock);
}
