package controller.DAO;

import java.util.List;

import Interfaces.DAO.IBoatDAO;
import model.EntityBoat;
import model.EntityDock;
import model.EntityOwner;

public abstract class BoatDAO extends DAO<EntityBoat> implements IBoatDAO{

	@Override
	public EntityBoat getById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public EntityBoat create(EntityBoat entity) throws Exception {
		
		throw new Exception("impossible de créer un bateau à partir de cette classe");
	}


}
