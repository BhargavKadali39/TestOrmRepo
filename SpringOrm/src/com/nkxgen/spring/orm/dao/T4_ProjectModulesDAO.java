package com.nkxgen.spring.orm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.nkxgen.spring.orm.model.T4_ProjectModules;

@Component
public class T4_ProjectModulesDAO {

	@PersistenceContext
	private EntityManager em;

	public void persist(T4_ProjectModules projmod) {
		em.persist(projmod);
	}

	public List<T4_ProjectModules> getAllModulesById(int projId) {
		String qry = "FROM T4_ProjectModules e WHERE e.project.proj_id = " + String.valueOf(projId);
		return em.createQuery(qry).getResultList();
		// String qry = "SELECT e FROM T4_ProjectModules e where modl_proj_id =" + projId;
		// return em.createQuery(qry).getResultList();.setParameter("modlProjId", projId)

		/*
		 * int projId = proj.getProjId(); String qry =
		 * "SELECT e FROM T4_ProjectModules e WHERE e.modl_proj_id = :projId"; return em.createQuery(qry)
		 * .setParameter("projId", projId) .getResultList();
		 */

	}

}