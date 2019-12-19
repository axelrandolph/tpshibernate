import javax.persistence.*;

@Entity
public class Person {
	
	@Id
	private int idPerson;
	
	@OneToOne(mappedBy = )
	private int idAdress;
	
	private String name;
	
	private int phoneNumber[];
	
	private String emailAdress;

}
