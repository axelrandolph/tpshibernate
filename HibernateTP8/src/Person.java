import javax.persistence.*;

@Entity
public class Person {
	
	@Id
	private int idPerson;
	
	private int idAdress;
	
	private String name;
	
	private int phoneNumber[];
	
	private String emailAdress;

}
