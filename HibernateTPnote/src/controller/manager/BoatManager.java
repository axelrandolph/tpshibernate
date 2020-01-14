package controller.manager;

import Interfaces.DAO.IBoatDAO;
import Interfaces.DAO.IDockDAO;
import Interfaces.DAO.IOwnerDAO;
import exceptions.BoatException;
import model.EntityBoat;
import model.EntityDock;
import model.EntityOwner;

public class BoatManager {

	private IBoatDAO boatDAO;
	protected IDockDAO dockDAO;
	protected IOwnerDAO ownerDAO;
	

	protected void checkWeight(float weight) throws BoatException {
		if(weight > 100) {
			throw new BoatException("Size is too much");
		}
	}
	
	
}
