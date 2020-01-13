package Interfaces.DAO;

import model.EntityOwner;

public interface IOwnerDAO {
	
	EntityOwner create(EntityOwner entity);
    void deleteById(int idOwner);
    EntityOwner searchById(int idOwner);

    
}
