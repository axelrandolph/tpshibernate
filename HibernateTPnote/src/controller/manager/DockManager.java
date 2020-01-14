package controller.manager;

import Interfaces.DAO.IDockDAO;
import Interfaces.Manager.IDockManager;
import controller.DAO.DockDAO;
import model.EntityDock;

public class DockManager extends ConnexionManager implements IDockManager {

	private IDockDAO dockDAO;
	
	public DockManager() {
		super();
		dockDAO = new DockDAO(em);
	}
	@Override
	public EntityDock createDock(int nbLocation) {

		EntityDock entityDock = new EntityDock(nbLocation);
		
		//entityDock = DockDAO( nbLocation);
		
		return entityDock;
	}
	@Override
	public void DeleteDock(EntityDock dock) {
		//DockDAO.deleteDock(dock);

	}
	
	@Override
	public int countBoatByDock(EntityDock dock) {
		
		return dockDAO.countBoatByDock(dock);
	}
	
}
