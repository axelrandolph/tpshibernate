package controller.manager;

import Interfaces.DAO.IDockDAO;
import Interfaces.Manager.IDockManager;
import model.EntityDock;

public class DockManager implements IDockManager {

	private IDockDAO DockDAO;
	@Override
	public EntityDock CreateDock(int nbLocation) {

		EntityDock entityDock = new EntityDock(nbLocation);
		
		entityDock = DockDAO.insertDock( nbLocation);
		
		return entityDock;
	}
	@Override
	public void DeleteDock(EntityDock dock) {
		DockDAO.deleteDock(dock);

	}
	
	
}
