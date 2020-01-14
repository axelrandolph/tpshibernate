package controller.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import Interfaces.DAO.ILocationDAO;
import model.EntityBoat;
import model.EntityLocation;

public class LocationDao extends DAO<EntityLocation> implements ILocationDAO {

	public LocationDao(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	@Override
	public EntityLocation create(EntityLocation entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(EntityLocation entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int entityId) {
		// TODO Auto-generated method stub
	}

	@Override
	public EntityLocation searchById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EntityLocation> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
