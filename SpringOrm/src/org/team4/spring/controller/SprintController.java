package org.team4.spring.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.team4.spring.dao.T4_ProjectsDAOImpl;
import org.team4.spring.model.T4_Projects;

@Controller
public class SprintController {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	@RequestMapping(value = "/sprints", method = RequestMethod.GET)
	public String getAllSprints(Model model) {
		System.out.println("Sprint List JSP Requested");

		// Retrieve all sprints from the database and add them to the model

		return "sprint_home";
	}

	@RequestMapping(value = "/sprint_details", method = RequestMethod.GET)
	public String getSprintDetails(Model model) {
		System.out.println("Sprint Details JSP Requested");

		// Retrieve the selected sprint details from the database and add them to the model

		return "sprint_details";
	}

	@RequestMapping(value = "/projectDetails", method = RequestMethod.GET)
	public String getProjectDetails(Model model) {
		System.out.println("Sprint Details JSP Requested");

		// Retrieve the selected sprint details from the database and add them to the model

		return "projectDetails";
	}

	@RequestMapping(value = "/add_sprint", method = RequestMethod.GET)
	public String addSprint(Model model) {
		System.out.println("Add Sprint JSP Requested");

		// Add any necessary data to the model for rendering the add sprint page

		return "add_sprint";
	}

	@RequestMapping(value = "/filterData", method = RequestMethod.GET)
	@ResponseBody
	public List<T4_Projects> getFilteredProjectData() {
		System.out.println("Filtered Project Data Requested");

		// Retrieve the filtered project data
		T4_ProjectsDAOImpl ds = new T4_ProjectsDAOImpl();
		List<T4_Projects> filteredProjects = ds.getProjectsByStatus("%");

		return filteredProjects;
	}
}
