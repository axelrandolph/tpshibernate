package Interfaces.Manager;

import model.EntityDock;

public interface IDockManager {

    EntityDock CreateDock(int nbLocation);

    void DeleteDock(EntityDock dock);

	 
}
