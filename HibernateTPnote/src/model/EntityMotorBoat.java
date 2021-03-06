package model;

import javax.persistence.Entity;

@Entity
public class EntityMotorBoat extends EntityBoat{

	/*Attribute*/
	private int nbHorsepower;

	/*Constructors*/
	public EntityMotorBoat() {}
	
	
	public EntityMotorBoat(int nbHorsepower) {
		this.nbHorsepower = nbHorsepower;
	}
	

	public EntityMotorBoat(EntityDock dock, String name, float weight, EntityOwner owner, int nbHorsePower2) {
		super( dock,  name,  weight,  owner);
		this.nbHorsepower = nbHorsePower2;
	}


	/*Getters & Setters*/
	public int getNbHorsepower() {
		return nbHorsepower;
	}

	public void setNbHorsepower(int nbHorsepower) {
		this.nbHorsepower = nbHorsepower;
	}
}
