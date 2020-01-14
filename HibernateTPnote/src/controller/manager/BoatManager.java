package controller.manager;

import Interfaces.DAO.IBoatDAO;
import model.EntityDock;

public class BoatManager {

	IBoatDAO boatDAO;
	
	public int countBoatByDock(EntityDock dock) {
		
		return boatDAO.countBoatByDock(dock);
	}
}
