package Interfaces.Manager;

import model.EntityOwner;

public interface IOwnerManager {

	   EntityOwner CreateOwner(String name, String address);

	    void DeleteOwner(EntityOwner dock);
}
