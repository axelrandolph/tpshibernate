import javax.persistence.*;

@Entity
public class Address {
	
	@OneToOne
	private Person p;
	
	@Id
	private EmbededIdAdress id;
}
