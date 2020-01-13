package controller.DAO;


import Interfaces.DAO.IDockDAO;
import model.EntityDock;

public class DockDAO extends DAO implements IDockDAO{


	@Override
	public EntityDock insertDock(int nbLocation) {

		
		EntityDock dock = new EntityDock();
		dock.setNbLocation(nbLocation);
		
		em.getTransaction().begin();
		em.persist(dock);
		em.getTransaction().commit();
		
		return dock;
	}
	
	public void deleteDock(EntityDock dock) {
		
		dock = em.find(EntityDock.class, dock.getCode());
		em.getTransaction().begin();
		em.remove(dock);
		em.getTransaction().commit();

	}

}
