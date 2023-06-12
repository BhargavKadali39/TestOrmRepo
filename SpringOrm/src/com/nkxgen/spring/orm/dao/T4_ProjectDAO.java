package com.nkxgen.spring.orm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.nkxgen.spring.orm.model.T4_Projects;

@Component
public class T4_ProjectDAO {

	@PersistenceContext
	private EntityManager em;

	public void persist(T4_Projects proj) {
		em.persist(proj);
	}

	public List<T4_Projects> getAllProjects() {
		return em.createQuery("SELECT e FROM T4_Projects e").getResultList();
	}

}