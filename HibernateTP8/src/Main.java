import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	
	public static void main(String[] args) {
	EntityManagerFactory entity = Persistence.createEntityManagerFactory("test");	
	EntityManager em = entity.createEntityManager();

	}
}	
