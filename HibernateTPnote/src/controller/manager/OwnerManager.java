package controller.manager;

import Interfaces.DAO.IOwnerDAO;
import Interfaces.Manager.IOwnerManager;
import model.EntityOwner;

public class OwnerManager implements  IOwnerManager{

	private IOwnerDAO ownerDAO;
	@Override
	public EntityOwner CreateOwner(String name, String address) {

		EntityOwner entityOwner = new EntityOwner(name,address);
		
		ownerDAO.create(entityOwner);
		
		return entityOwner;
	}

	@Override
	public void DeleteOwner(int idOwner) {
		
		ownerDAO.deleteById(idOwner);
		
	}

	@Override
	public EntityOwner searchOwner(int idOwner) {

		ownerDAO.getById(idOwner);
		return null;
	}

}
