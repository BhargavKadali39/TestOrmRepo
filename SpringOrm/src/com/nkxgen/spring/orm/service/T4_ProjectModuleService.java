package com.nkxgen.spring.orm.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.nkxgen.spring.orm.dao.T4_ProjectModulesDAO;
import com.nkxgen.spring.orm.model.T4_ProjectModules;

@Component
public class T4_ProjectModuleService {

	private T4_ProjectModulesDAO projectModulesDAO;

	@Autowired
	public T4_ProjectModuleService(T4_ProjectModulesDAO promoddao) {
		this.projectModulesDAO = promoddao;
	}

	@Transactional
	public void add(T4_ProjectModules projectModule) {
		projectModulesDAO.persist(projectModule);
	}

	@Transactional
	public void addAll(Collection<T4_ProjectModules> ProjectModuleList) {
		for (T4_ProjectModules projectModule : ProjectModuleList) {
			projectModulesDAO.persist(projectModule);
		}
	}

	@Transactional(readOnly = true)
	public List<T4_ProjectModules> listById(int projId) {
		return projectModulesDAO.getAllModulesById(projId);
	}
}
