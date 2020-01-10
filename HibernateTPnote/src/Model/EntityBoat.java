package Model;

import java.util.ArrayList;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class EntityBoat {

	/*Attribute*/
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idBoat;
	
	@ManyToOne
	private EntityDock dock;
	
	private String name;
	private int weight;
	
	@ManyToOne
	private EntityOwner owner;
	
	@OneToMany(mappedBy="boat")
	private ArrayList<EntityLocation> locations;
	/*Constructors*/
	public EntityBoat(){}
	
	public EntityBoat(EntityDock dock,String name, int weight,int idBoat, EntityOwner owner) {
		
		this.dock = dock;
		this.name = name;
		this.weight = weight;
		this.idBoat = idBoat;
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
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
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
