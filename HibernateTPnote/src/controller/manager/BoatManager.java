package controller.manager;

import Interfaces.DAO.IBoatDAO;
import Interfaces.DAO.IDockDAO;
import Interfaces.DAO.IOwnerDAO;
import controller.DAO.BoatDAO;
import controller.DAO.DockDAO;
import controller.DAO.OwnerDAO;
import exceptions.BoatException;
import model.EntityBoat;
import model.EntityDock;
import model.EntityOwner;

public class BoatManager extends ConnexionManager{

	private IBoatDAO boatDAO;
	protected IDockDAO dockDAO;
	protected IOwnerDAO ownerDAO;
	

	public BoatManager() {
		super();
		boatDAO = new BoatDAO(em);
		dockDAO = new DockDAO(em);
		ownerDAO = new OwnerDAO(em);
	}
	protected void checkWeight(float weight) throws BoatException {
		if(weight > 100) {
			throw new BoatException("Size is too much");
		}
	}
	
	
}
