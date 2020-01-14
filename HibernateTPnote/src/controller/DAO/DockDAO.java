package controller.DAO;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Interfaces.DAO.IDockDAO;
import model.EntityDock;
import model.EntityLocation;
import model.EntityOwner;

public class DockDAO extends DAO<EntityDock> implements IDockDAO{


	public DockDAO(EntityManager em) {
		super(em);
	}



	@Override
	public void delete(EntityDock entity) throws Exception {
		
		EntityDock dock = em.find(EntityDock.class, entity.getCode());
		if(dock == null) {
			throw new Exception("Impossible de récupérer le propriétaire de cet identifiant");
		}
		em.getTransaction().begin();
		em.remove(dock);
		em.getTransaction().commit();

	}

	@Override
	public EntityDock getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EntityDock> getAll() {
		
		List<EntityDock> listDock = null;
		Query query = em.createQuery("select * from EntityDock");
		listDock = query.getResultList();
		
		return listDock;
	}


	@Override
	public int countBoatByDock(EntityDock dock) {
		String query = "SELECT count(*) FROM entityboat where code = "+dock.getCode();
		return 0;
	}
	

}
