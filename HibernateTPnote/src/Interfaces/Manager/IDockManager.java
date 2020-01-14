package Interfaces.Manager;

import model.EntityDock;

public interface IDockManager {

    EntityDock createDock(int nbLocation);

    void DeleteDock(EntityDock dock);

    int countBoatByDock(EntityDock dock);
	 
}
