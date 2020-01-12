package controller.manager;

import Interfaces.DAO.IOwnerDAO;
import Interfaces.Manager.IOwnerManager;
import model.EntityOwner;

public class OwnerManager implements  IOwnerManager{

	private IOwnerDAO ownerDAO;
	@Override
	public EntityOwner CreateOwner(String name, String address) {

		EntityOwner entityOwner = new EntityOwner(name,address);
		
		entityOwner = ownerDAO.insertDock(name, address);
		
		return entityOwner;
	}

	@Override
	public void DeleteOwner(EntityOwner owner) {

		ownerDAO.deleteDock(owner);
	}

}
