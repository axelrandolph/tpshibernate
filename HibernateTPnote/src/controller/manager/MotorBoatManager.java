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
		EntityDock dock = dockDAO.getById(idDock);
		EntityOwner owner = ownerDAO.getById(idOwner);
		
		EntityMotorBoat motorBoat = new EntityMotorBoat( dock, name,  weight,  owner, nbHorsePower);
		motorboatDAO.create(motorBoat);
		
		return motorBoat;	
		
	}

}
