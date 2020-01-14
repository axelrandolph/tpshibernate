package controller.manager;

import Interfaces.DAO.ISailDAO;
import exceptions.BoatException;
import model.EntityDock;
import model.EntityOwner;
import model.EntitySailBoat;

public class SailBoatManager extends BoatManager{
	
	private ISailDAO sailDAO;
	
	public EntitySailBoat createBoat(int idDock, int idOwner, float weight, String name, float sailArea ) throws BoatException {
		
		checkWeight(weight);
		EntityDock dock;
		EntityOwner owner;
		EntitySailBoat sailBoat = null;
		
		try {
			dock = dockDAO.getById(idDock);
			owner = ownerDAO.getById(idOwner);
			sailBoat = new EntitySailBoat( dock, name,  weight,  owner, sailArea);
			sailDAO.create(sailBoat);
		} catch (Exception e) {
			
			throw new BoatException(e.getMessage());
		}
		
		
		return sailBoat;	
		
	}

}
