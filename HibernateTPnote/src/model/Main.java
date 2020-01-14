package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.DAO.IDAO;
import Interfaces.DAO.IDockDAO;
import controller.DAO.BoatDAO;
import controller.DAO.DockDAO;
import controller.manager.DockManager;
import controller.manager.OwnerManager;
import controller.manager.SailBoatManager;
import exceptions.BoatException;
import exceptions.OwnerException;

public class Main {
	
	public static void main(String argv[]) {
				
		
		SailBoatManager smanager = new SailBoatManager();
		DockManager dmanager = new DockManager();
		OwnerManager omanager = new OwnerManager();
		dmanager.createDock(3);
		try {
			omanager.CreateOwner("axel", "j habite a polytech");
		} catch (OwnerException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			smanager.createBoat(1, 1, 20, "lacreation d axel", 30);
		} catch (BoatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateTPnote");
		EntityManager em = emf.createEntityManager();
		
		EntityDock dock = new EntityDock(5);
		EntityOwner owner = new EntityOwner("owneeeer", "45 rue polytech");
		EntityMotorBoat mboat = new EntityMotorBoat(dock, "mon nouveau bateau", 45, owner, 20);*/
		
		/*
		em.getTransaction().begin();
		em.persist(dock);
		em.getTransaction().commit();
		
		em.getTransaction().begin();
		em.persist(owner);
		em.getTransaction().commit();
		
		em.getTransaction().begin();
		em.persist(mboat);
		em.getTransaction().commit();*/
		
		
		
		
		
	}
	
	

}
