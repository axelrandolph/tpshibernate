package controller.DAO;


import java.util.List;

import javax.persistence.EntityManager;

import Interfaces.DAO.IDockDAO;
import model.EntityDock;

public class DockDAO extends DAO<EntityDock> implements IDockDAO{


	public DockDAO(EntityManager em) {
		super(em);
	}

	@Override
	public EntityDock create(EntityDock entity) {

		return null;
	}

	@Override
	public void delete(EntityDock entity) {
		
		/*dock = em.find(EntityDock.class, dock.getCode());
		em.getTransaction().begin();
		em.remove(dock);
		em.getTransaction().commit();*/
	}

	@Override
	public void deleteById(int entityId) {
		// TODO Auto-generated method stub
	}

	@Override
	public EntityDock searchById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EntityDock> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
