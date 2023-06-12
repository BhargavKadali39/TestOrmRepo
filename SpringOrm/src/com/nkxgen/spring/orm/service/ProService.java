package com.nkxgen.spring.orm.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.nkxgen.spring.orm.dao.T4_ProjectDAO;
import com.nkxgen.spring.orm.model.T4_Projects;

@Component
public class ProService {

	private T4_ProjectDAO projectDAO;

	@Autowired
	public ProService(T4_ProjectDAO prodao) {
		this.projectDAO = prodao;
	}

	@Transactional
	public void add(T4_Projects project) {
		projectDAO.persist(project);
	}

	@Transactional
	public void addAll(Collection<T4_Projects> projectList) {
		for (T4_Projects project : projectList) {
			projectDAO.persist(project);
		}
	}

	@Transactional(readOnly = true)
	public List<T4_Projects> listAll() {
		return projectDAO.getAllProjects();
	}
}
