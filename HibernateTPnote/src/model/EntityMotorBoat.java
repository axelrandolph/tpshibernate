package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("M")
public class EntityMotorBoat extends EntityBoat{

	/*Attribute*/
	private int nbHorsepower;

	/*Constructors*/
	public EntityMotorBoat() {}
	
	
	public EntityMotorBoat(int nbHorsepower) {
		this.nbHorsepower = nbHorsepower;
	}

	/*Getters & Setters*/
	public int getNbHorsepower() {
		return nbHorsepower;
	}

	public void setNbHorsepower(int nbHorsepower) {
		this.nbHorsepower = nbHorsepower;
	}
}
