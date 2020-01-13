package Interfaces.DAO;

import model.EntityOwner;

public interface IOwnerDAO {

	public EntityOwner insertDock(String name, String address);
	public void deleteDock(EntityOwner owner);
}
