package controller.manager;

import Interfaces.DAO.IMotorDAO;
import exceptions.BoatException;
import model.EntityDock;
import model.EntityMotorBoat;
import model.EntityOwner;

public class MotorBoatManager extends BoatManager{
	
	private IMotorDAO motorboatDAO;
	
	public EntityMotorBoat createBoat(int idDock, int idOwner, float weight, String name, int nbHorsePower ) throws BoatException {
		
		checkWeight(weight);
		EntityOwner owner; 
		EntityDock dock;
		EntityMotorBoat motorBoat = null;
		try {
			dock = dockDAO.getById(idDock);
			owner = ownerDAO.getById(idOwner);
			motorBoat = new EntityMotorBoat( dock, name,  weight,  owner, nbHorsePower);
			motorboatDAO.create(motorBoat);
		} catch (Exception e) {
			throw new BoatException(e.getMessage());
		}
		
		return motorBoat;	
		
	}

}
