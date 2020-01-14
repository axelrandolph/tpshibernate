package Interfaces.Manager;

import exceptions.OwnerException;
import model.EntityOwner;

public interface IOwnerManager {

	   EntityOwner CreateOwner(String name, String address) throws OwnerException;

	    void DeleteOwner(int idOwner) throws OwnerException;
	    
	    EntityOwner searchOwner(int idOwner) throws OwnerException;
}
