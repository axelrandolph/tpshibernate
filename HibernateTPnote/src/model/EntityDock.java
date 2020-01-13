package model;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class EntityDock {
	
	/*Attribute*/
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int code;
	private int nbLocation;
	
	@OneToMany(mappedBy = "dock")
	private List<EntityBoat> boats;
	
	@OneToMany(mappedBy = "dock")
	private List<EntityLocation> locations;

	
	/*Constructors*/
	public EntityDock() {}
	
	public EntityDock(int nbLocation) {
		
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
