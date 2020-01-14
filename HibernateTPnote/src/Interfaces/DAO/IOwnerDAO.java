package Interfaces.DAO;

import model.EntityOwner;

public interface IOwnerDAO {
	
	EntityOwner create(EntityOwner entity);
    void deleteById(int idOwner);
    EntityOwner getById(int idOwner);

    
}
