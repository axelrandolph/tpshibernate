import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "idPerson")	
public class Student extends Person{
	
	
	private int idStudent;
	
	private int number;
	
	private double averageMark;
	

}
