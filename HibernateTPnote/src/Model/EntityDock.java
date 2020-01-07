package Model;

import javax.persistence.Entity;

@Entity
public class EntityDock {
	
	private int code;
	private int nbLocation;
	
	public EntityDock() {}
	
	public EntityDock(int code,int nbLocation) {
		
		this.code = code;
		this.nbLocation = nbLocation;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getNbLocation() {
		return nbLocation;
	}
	public void setNbLocation(int nbLocation) {
		this.nbLocation = nbLocation;
	}

}
