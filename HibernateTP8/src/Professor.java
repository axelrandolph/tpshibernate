import javax.persistence.*;

@Entity
public class Professor extends Person{
	
	@Id
	private int idProfessor;
	
	private double salary;


}
