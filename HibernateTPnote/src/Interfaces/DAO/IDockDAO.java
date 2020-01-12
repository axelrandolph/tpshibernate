package Interfaces.DAO;

import model.EntityDock;

public interface IDockDAO {

	public EntityDock insertDock(int nbLocation);
	public void deleteDock(EntityDock dock);
}
