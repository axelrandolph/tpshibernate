import javax.persistence.*;

@Entity
public class Student extends Person{
	
	@Id
	private int idStudent;
	
	private int number;
	
	private double averageMark;
	

}
