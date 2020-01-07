import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "idPerson")	
public class Professor extends Person{
	
	
	private int idProfessor;
	
	private double salary;
	
	


}
