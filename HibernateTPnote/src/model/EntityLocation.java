package model;

/*REGEX 
 * size <= 200 m�
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class EntityLocation {
	
	/*Attribute*/
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int code;
	private int size;
	
	@ManyToOne
	private EntityBoat boat;
	
	@ManyToOne
	private EntityDock dock;

	/*Constructors*/
	public EntityLocation() {}
	
	public EntityLocation( int size, EntityDock dock) {
		
		this.size = size;
		this.dock = dock;
		this.boat = null;
	}
	

	/*Getters & Setters*/
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public EntityBoat getBoat() {
		return boat;
	}
	public void setBoat(EntityBoat boat) {
		this.boat = boat;
	}
	

}
