package model;

import javax.persistence.Entity;

@Entity
public class EntitySailBoat extends EntityBoat {

	/*Attribute*/
	private float sailArea;

	/*Constructors*/
	public EntitySailBoat() {}
	
	public EntitySailBoat(EntityDock dock,String name, float weight, EntityOwner owner, float area) {
		super( dock, name,  weight,  owner);
		this.sailArea = sailArea;	
	}
	
	
	/*Getters & Setters*/
	public float getSailArea() {
		return sailArea;
	}

	public void setSailArea(float sailArea) {
		this.sailArea = sailArea;
	}
}
