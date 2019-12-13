import org.hibernate.annotations.*;

@Entity
public class Ecole {
	
	@Id
	private int idecole;
	private String nom;
	private int nbeleves;
	
	@ForeignKey
	private idEnseignat;
	
}
