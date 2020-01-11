package controller.DAO;

import Interfaces.DAO.IOwnerDAO;
import model.EntityOwner;

public class OwnerDAO extends DAO implements IOwnerDAO {

	@Override
	public EntityOwner insertDock(String name, String address) {
		
		EntityOwner owner = new EntityOwner();
		owner.setName(name);
		owner.setAddress(address);
		
		em.getTransaction().begin();
		em.persist(owner);
		em.getTransaction().commit();
		
		return owner;
	}

	@Override
	public void deleteDock(EntityOwner owner) {

		owner = em.find(EntityOwner.class, owner.getIdOwner());
		em.getTransaction().begin();
		em.remove(owner);
		em.getTransaction().commit();
	}

	
}
