package com.nkxgen.spring.orm.service;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkxgen.spring.orm.dao.ProjectDAO;
import com.nkxgen.spring.orm.model.Project;
import com.nkxgen.spring.orm.model.ProjectDto;
import com.nkxgen.spring.orm.model.ProjectInput;

@Service
@Transactional
public class ProjectService {

	private final ProjectDAO projectDAO;

	@Autowired
	public ProjectService(ProjectDAO projectDAO) {
		this.projectDAO = projectDAO;
	}

	public List<ProjectDto> getAllProjects() {
		return projectDAO.getAllProjects();
	}

	public ProjectDto getProjectById(Integer projId) {
		return projectDAO.getProjectById(projId);
	}

	public void setNewProject(ProjectInput projectInput) {
		System.out.println("projinpt " + projectInput);
		Date currentDate = new Date(System.currentTimeMillis());
		projectInput.setProjectStartDate(currentDate);
		projectInput.setProjectStatus("O");

		System.out.println(projectInput);
		Project project = projectInput.toEntity();

		projectDAO.setNewProject(project);

	}

	// Add methods for creating, updating, and deleting projects if needed
}
