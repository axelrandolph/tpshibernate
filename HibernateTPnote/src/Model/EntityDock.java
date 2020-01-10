package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EntityDock {
	
	/*Attribute*/
	@Id @GeneratedValue
	private int code;
	private int nbLocation;
	
	/*Constructors*/
	public EntityDock() {}
	
	public EntityDock(int code,int nbLocation) {
		
		this.code = code;
		this.nbLocation = nbLocation;
	}
	
	/*Getters & Setters*/
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
