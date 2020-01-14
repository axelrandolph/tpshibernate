package controller.DAO;

import java.util.List;

import Interfaces.DAO.IBoatDAO;
import model.EntityBoat;
import model.EntityDock;
import model.EntityOwner;

public class BoatDAO extends DAO implements IBoatDAO{

	
	@Override
	public int countBoatByDock(EntityDock dock) {
		
		String queryString = "select count(*) from boat where dock = ";
		return 0;
	}

	@Override
	public void insertBoat(EntityDock dock, String name, float weight, EntityOwner owner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object create(Object entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Object entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int entityId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object searchById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
