package Model;

import javax.persistence.Entity;

@Entity
public class EntityLocation {
	
	private int code;
	private int size;
	private EntityBoat boat;

	public EntityLocation() {}
	
	public EntityLocation(int code, int size, EntityBoat boat) {
		
		this.code = code;
		this.size = size;
		this.boat = boat;
	}
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
