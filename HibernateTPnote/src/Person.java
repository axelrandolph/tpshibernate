import javax.persistence.*;

@Entity 
@Inheritance(strategy  = InheritanceType.JOINED)
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPerson;
	
	private int idAdress;
	
	private String name;
	
	private String phoneNumber;
	
	private String emailAdress;
	
	private String status;
	
	@OneToOne( cascade = CascadeType.ALL)
	private Address adr;

	public Person() {}
	
	public Person (int idPerson, int idAddress,String name, String phoneNumber, String emailAddress, String Status) {
		
		this.idPerson = idPerson;
		this.idAdress = idAddress;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAdress = emailAddress;
		this.status = Status;
	}
	
	public int getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}

	public int getIdAdress() {
		return idAdress;
	}

	public void setIdAdress(int idAdress) {
		this.idAdress = idAdress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	} 

}
