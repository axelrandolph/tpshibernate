package model;

import java.util.List;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class EntityBoat {

	/*Attribute*/
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idBoat;
	
	@ManyToOne
	private EntityDock dock;
	
	private String name;
	private float weight;
	
	@ManyToOne
	private EntityOwner owner;
	
	@OneToMany(mappedBy="boat")
	private List<EntityLocation> locations;
	/*Constructors*/
	public EntityBoat(){}
	
	
	public EntityBoat(EntityDock dock,String name, float weight, EntityOwner owner) {
		
		this.dock = dock;
		this.name = name;
		this.weight = weight;
		this.owner = owner;
	}
	
	/*Getters & Setters*/
	public EntityDock getDock() {
		return dock;
	}
	public void setDock(EntityDock dock) {
		this.dock = dock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public List<EntityLocation> getLocations() {
		return locations;
	}

	public void setLocations(List<EntityLocation> locations) {
		this.locations = locations;
	}

	public int getIdBoat() {
		return idBoat;
	}
	public void setIdBoat(int idBoat) {
		this.idBoat = idBoat;
	}
	public EntityOwner getOwner() {
		return owner;
	}
	public void setOwner(EntityOwner owner) {
		this.owner = owner;
	}
	
	
	
}
