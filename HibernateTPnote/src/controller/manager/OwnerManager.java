package controller.manager;

import Interfaces.DAO.IOwnerDAO;
import Interfaces.Manager.IOwnerManager;
import controller.DAO.OwnerDAO;
import exceptions.OwnerException;
import model.EntityOwner;

public class OwnerManager extends ConnexionManager implements  IOwnerManager{

	private IOwnerDAO ownerDAO;
	
	public OwnerManager() {
		super();
		ownerDAO = new OwnerDAO(em);
	}
	@Override
	public EntityOwner CreateOwner(String name, String address) throws OwnerException {

		EntityOwner entityOwner = new EntityOwner(name,address);
		
		try {
			ownerDAO.create(entityOwner);
		} catch (Exception e) {
			throw new OwnerException(e.getMessage());
		}
		
		return entityOwner;
	}

	@Override
	public void DeleteOwner(int idOwner) {
		
		
	}

	@Override
	public EntityOwner searchOwner(int idOwner) {
		return null;

	}

}
