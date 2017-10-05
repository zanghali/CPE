package fr.cpe.model;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UserDao implements Serializable {
	
	@PersistenceContext
	EntityManager em;
	
	public void save (User user) {
		em.persist(user);
	}

}
