package controller.DAO;

import Interfaces.IBoatDAO;
import model.EntityBoat;
import model.EntityDock;
import model.EntityOwner;

public class BoatDAO extends DAO implements IBoatDAO{

	
	@Override
	public int countBoatByDock(EntityDock dock) {
		
		String queryString = "select count(*) from boat where dock = ";
		return 0;
	}
	
	

}
