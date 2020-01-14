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
		EntityDock dock = dockDAO.getById(idDock);
		EntityOwner owner = ownerDAO.getById(idOwner);
		
		EntitySailBoat sailBoat = new EntitySailBoat( dock, name,  weight,  owner, sailArea);
		sailDAO.create(sailBoat);
		
		return sailBoat;	
		
	}

}
