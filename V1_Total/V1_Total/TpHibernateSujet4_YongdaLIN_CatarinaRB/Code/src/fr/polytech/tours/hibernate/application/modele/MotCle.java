package fr.polytech.tours.hibernate.application.modele;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class MotCle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int MotCleID;
	private String MotCle;
	@ManyToMany(mappedBy = "ListeMotCle")
	private List<Message> ListeMessages;
	
	public MotCle() {
		MotCleID = -1;
		MotCle = "";
		ListeMessages = null;
	}
	
	public MotCle(String motCle) {
		MotCleID = -1;
		MotCle = motCle;
		ListeMessages = null;
	}

	public MotCle(String motCle, List<Message> listeMessages) {
		MotCleID = -1;
		MotCle = motCle;
		ListeMessages = listeMessages;
	}
	
	@Override
	public String toString() {
		return MotCle;
	}

	public int getMotCleID() {
		return MotCleID;
	}

	public void setMotCleID(int motCleID) {
		MotCleID = motCleID;
	}

	public String getMotCle() {
		return MotCle;
	}

	public void setMotCle(String motCle) {
		MotCle = motCle;
	}

	public List<Message> getListeMessages() {
		return ListeMessages;
	}

	public void setListeMessages(List<Message> listeMessages) {
		ListeMessages = listeMessages;
	}

}
