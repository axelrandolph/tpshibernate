package model;

import java.util.List;

import javax.persistence.*;

@Entity
public class EntityOwner {
	
	/*Attribute*/
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idOwner;
	private String name;
	private String address;
	
	@OneToMany(mappedBy = "owner")
	private List<EntityBoat> boats;
	
	/*Constructors*/
	public EntityOwner() {}

	public EntityOwner(int idOwner,String name, String address) {
		
		this.idOwner = idOwner;
		this.name = name;
		this.address = address;
	}
	
	/*Getters & Setters*/
	public int getIdOwner() {
		return idOwner;
	}

	public void setIdOwner(int idOwner) {
		this.idOwner = idOwner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
