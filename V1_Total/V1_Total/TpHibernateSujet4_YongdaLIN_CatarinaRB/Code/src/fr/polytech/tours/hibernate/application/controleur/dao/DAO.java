package fr.polytech.tours.hibernate.application.controleur.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class DAO<T> {

	@PersistenceContext
	protected EntityManager em;

	public DAO(EntityManager entityManager) {
		this.em = entityManager;
	}

	public abstract boolean creer(T entity);

	public abstract boolean modifier(T entity);

	public abstract boolean supprimer(T entity);

	public abstract boolean supprimerParID(int entityId);
	
	public abstract T chercherParID(int id);

	public abstract List<T> chercherTous();
}
