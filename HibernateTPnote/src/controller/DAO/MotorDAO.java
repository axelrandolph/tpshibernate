package controller.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import Interfaces.DAO.IMotorDAO;
import model.EntityBoat;
import model.EntityMotorBoat;

public class MotorDAO extends DAO<EntityMotorBoat> implements IMotorDAO{

	public MotorDAO(EntityManager em) {
		super(em);
	}
	
	@Override
	public void delete(EntityMotorBoat entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EntityMotorBoat getById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EntityMotorBoat> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
