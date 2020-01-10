package Model;

import javax.persistence.Entity;

@Entity
public class EntitySailBoat extends EntityBoat {

	/*Attribute*/
	private float sailArea;

	/*Constructors*/
	public EntitySailBoat() {}
	
	public EntitySailBoat(float sailArea) {
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
