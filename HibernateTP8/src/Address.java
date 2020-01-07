import javax.persistence.*;

@Entity 
public class Address {

	@Id
	private EmbededIdAdress id;
	
	@OneToOne( mappedBy = "adr",cascade = CascadeType.ALL)
	private Person person;
}

