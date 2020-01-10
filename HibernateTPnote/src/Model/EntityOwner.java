package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EntityOwner {
	
	/*Attribute*/
	@Id @GeneratedValue
	private int idOwner;
	private String name;
	private String address;
	
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
